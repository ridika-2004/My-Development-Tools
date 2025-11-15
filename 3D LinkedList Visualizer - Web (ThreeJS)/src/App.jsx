import "./App.css";
import * as THREE from "three";
import { useEffect, useRef, useState } from "react";
import { OrbitControls } from "three/examples/jsm/controls/OrbitControls.js";
import Stats from "three/examples/jsm/libs/stats.module.js";

function App() {
  const [mode, setMode] = useState("camera");
  const [nodeName, setNodeName] = useState("");
  const nodesRef = useRef([]);
  const edgesRef = useRef([]);
  const sceneRef = useRef(null);
  const rendererRef = useRef(null);
  const cameraRef = useRef(null);
  const controlsRef = useRef(null);
  const animationIdRef = useRef(null);

  useEffect(() => {
    const canvas = document.getElementById("mythreejscanvas");

    // Scene
    const scene = new THREE.Scene();
    scene.background = new THREE.Color(0x000000);
    sceneRef.current = scene;

    // Camera
    const camera = new THREE.PerspectiveCamera(
      75,
      window.innerWidth / window.innerHeight,
      0.1,
      1000
    );
    camera.position.set(0, 5, 10);
    camera.lookAt(0, 0, 0);
    cameraRef.current = camera;

    // Renderer
    const renderer = new THREE.WebGLRenderer({
      canvas,
      antialias: true,
    });
    renderer.setSize(window.innerWidth, window.innerHeight);
    renderer.setClearColor(0x000000);
    rendererRef.current = renderer;

    // Lights
    const ambientLight = new THREE.AmbientLight(0xffffff, 0.6);
    scene.add(ambientLight);

    const directionalLight = new THREE.DirectionalLight(0xffffff, 0.8);
    directionalLight.position.set(10, 10, 5);
    scene.add(directionalLight);

    // Controls
    const controls = new OrbitControls(camera, renderer.domElement);
    controls.enableDamping = true;
    controls.dampingFactor = 0.05;
    controlsRef.current = controls;

    // Stats
    const stats = new Stats();
    document.body.appendChild(stats.dom);

    // Animation loop
    const animate = () => {
      animationIdRef.current = requestAnimationFrame(animate);
      stats.update();
      controls.update();
      renderer.render(scene, camera);
    };
    animate();

    // Handle window resize
    const handleResize = () => {
      camera.aspect = window.innerWidth / window.innerHeight;
      camera.updateProjectionMatrix();
      renderer.setSize(window.innerWidth, window.innerHeight);
    };
    window.addEventListener('resize', handleResize);

    // Cleanup
    return () => {
      window.removeEventListener('resize', handleResize);
      if (animationIdRef.current) {
        cancelAnimationFrame(animationIdRef.current);
      }
      if (stats.dom && stats.dom.parentNode) {
        stats.dom.parentNode.removeChild(stats.dom);
      }
      renderer.dispose();
    };
  }, []);

  const createNode = (name) => {
    if (!sceneRef.current) return;

    const nodes = nodesRef.current;
    const edges = edgesRef.current;
    
    // Calculate position for new node
    const xPos = nodes.length * 3;
    const yPos = 0;
    const zPos = 0;

    // Create node sphere with animation
    const geometry = new THREE.SphereGeometry(0.5, 16, 16);
    const material = new THREE.MeshPhongMaterial({ 
      color: 0x4287f5 
    });
    const sphere = new THREE.Mesh(geometry, material);
    sphere.position.set(xPos, yPos, zPos);
    sphere.scale.set(0, 0, 0); // Start from scale 0 for pop-up animation
    
    // Create text sprite for node name
const canvas = document.createElement('canvas');
const context = canvas.getContext('2d');
canvas.width = 256;
canvas.height = 128;

// Make canvas transparent
context.clearRect(0, 0, canvas.width, canvas.height);

context.font = 'bold 48px Arial';
context.fillStyle = '#ffffff';  // Keep text color white
context.textAlign = 'center';
context.fillText(name || `Node ${nodes.length}`, canvas.width / 2, canvas.height / 2 + 15);
    
    const texture = new THREE.CanvasTexture(canvas);
    const textMaterial = new THREE.SpriteMaterial({ 
      map: texture,
      transparent: true 
    });
    const textSprite = new THREE.Sprite(textMaterial);
    textSprite.position.set(0, 1.2, 0);
    textSprite.scale.set(3, 1.5, 1);
    sphere.add(textSprite);

    // Create pointer/arrow for next node
    const pointerGeometry = new THREE.ConeGeometry(0.2, 0.8, 8);
    const pointerMaterial = new THREE.MeshPhongMaterial({ color: 0x00ff00 });
    const pointer = new THREE.Mesh(pointerGeometry, pointerMaterial);
    pointer.position.set(1, 0, 0);
    pointer.rotation.z = -Math.PI / 2;
    sphere.add(pointer);

    sceneRef.current.add(sphere);
    
    // Animation for pop-up effect
    const startTime = Date.now();
    const duration = 500; // milliseconds
    
    const animateNode = () => {
      const elapsed = Date.now() - startTime;
      const progress = Math.min(elapsed / duration, 1);
      
      // Elastic out easing function for bouncy effect
      const elasticOut = (t) => {
        return Math.sin(-13.0 * (t + 1.0) * Math.PI/2) * Math.pow(2.0, -10.0 * t) + 1.0;
      };
      
      const scale = elasticOut(progress);
      sphere.scale.set(scale, scale, scale);
      
      if (progress < 1) {
        requestAnimationFrame(animateNode);
      }
    };
    
    animateNode();

    // Create edge from previous node if it exists
    if (nodes.length > 0) {
      const previousNode = nodes[nodes.length - 1];
      
      // Create curved edge
      const startPos = previousNode.position.clone();
      startPos.x += 1; // Start from the pointer position
      const endPos = sphere.position.clone();
      endPos.x -= 1; // End before the new node
      
      // Create a curved line using quadratic bezier curve
      const curve = new THREE.QuadraticBezierCurve3(
        startPos,
        new THREE.Vector3((startPos.x + endPos.x) / 2, startPos.y + 2, startPos.z),
        endPos
      );
      
      const points = curve.getPoints(20);
      const geometry = new THREE.BufferGeometry().setFromPoints(points);
      const material = new THREE.LineBasicMaterial({ 
        color: 0xffffff,
        linewidth: 2
      });
      const edge = new THREE.Line(geometry, material);
      
      sceneRef.current.add(edge);
      edges.push(edge);
    }

    nodes.push(sphere);
    nodesRef.current = nodes;
    edgesRef.current = edges;
  };

  const handleAddNode = () => {
    if (nodeName.trim() !== "") {
      createNode(nodeName.trim());
      setNodeName("");
    }
  };

  const handleKeyPress = (e) => {
    if (e.key === 'Enter') {
      handleAddNode();
    }
  };

  const clearLinkedList = () => {
    if (sceneRef.current) {
      // Remove all nodes
      nodesRef.current.forEach(node => {
        sceneRef.current.remove(node);
      });
      nodesRef.current = [];
      
      // Remove all edges
      edgesRef.current.forEach(edge => {
        sceneRef.current.remove(edge);
      });
      edgesRef.current = [];
    }
  };

  const btnStyle = (active) => ({
    padding: "8px 12px",
    marginBottom: "6px",
    border: "none",
    borderRadius: "6px",
    cursor: "pointer",
    background: mode === active ? "#555" : "#222",
    color: "#fff",
    width: "140px",
    display: "block"
  });

  const inputStyle = {
    padding: "8px",
    marginBottom: "8px",
    border: "1px solid #555",
    borderRadius: "6px",
    background: "#222",
    color: "#fff",
    width: "124px",
    outline: "none"
  };

return (
  <>
    <canvas id="mythreejscanvas"></canvas>

    <div className="control-panel">
      <div className="panel-title">🔗 Linked List Visualizer</div>

      <input
        className="cool-input"
        type="text"
        placeholder="Node name..."
        value={nodeName}
        onChange={(e) => setNodeName(e.target.value)}
        onKeyPress={handleKeyPress}
        maxLength={10}
      />

      <button 
        className="cool-btn"
        onClick={handleAddNode}
        disabled={!nodeName.trim()}
      >
        ➕ Add Node
      </button>

      <button className="cool-btn" onClick={() => setMode("camera")}>
        🎥 Camera Mode
      </button>

      <button className="cool-btn danger-btn" onClick={clearLinkedList}>
        🗑 Clear List
      </button>

      <div className="panel-stats">
        Nodes: {nodesRef.current.length}
      </div>
    </div>
  </>
);

}

export default App;