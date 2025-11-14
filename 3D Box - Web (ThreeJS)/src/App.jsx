import './App.css'
import * as THREE from 'three'
import { useEffect } from 'react'

import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls.js'
import Stats from 'three/examples/jsm/libs/stats.module.js';

function App() {

  useEffect(() => {
    const canvas = document.getElementById('mythreejscanvas');

    // Scene
    const scene = new THREE.Scene();

    // Camera
    const camera = new THREE.PerspectiveCamera(
      75,
      window.innerWidth / window.innerHeight,
      0.1,
      1000
    );
    camera.position.z = 3;

    // Renderer
    const renderer = new THREE.WebGLRenderer({
      canvas,
      antialias: true,
      alpha: true,
    });
    renderer.setSize(window.innerWidth, window.innerHeight);
    renderer.setClearColor(0x000000, 0);

    // Lights
    const ambientLight = new THREE.AmbientLight(0xffffff, 0.6);
    scene.add(ambientLight);

    const spotlight = new THREE.SpotLight(0xffffff, 1);
    spotlight.position.set(5, 5, 5);
    scene.add(spotlight);

    // ====== Multi-colored Cube ======
    const faceMaterials = [
      new THREE.MeshStandardMaterial({ color: 0xff0000 }), // +X
      new THREE.MeshStandardMaterial({ color: 0x00ff00 }), // -X
      new THREE.MeshStandardMaterial({ color: 0x0000ff }), // +Y
      new THREE.MeshStandardMaterial({ color: 0xffff00 }), // -Y
      new THREE.MeshStandardMaterial({ color: 0xff00ff }), // +Z
      new THREE.MeshStandardMaterial({ color: 0x00ffff })  // -Z
    ];

    const boxGeometry = new THREE.BoxGeometry(1, 1, 1);
    const boxMesh = new THREE.Mesh(boxGeometry, faceMaterials);
    scene.add(boxMesh);
    // =================================

    const controls = new OrbitControls(camera, renderer.domElement);

    const stats = Stats();
    document.body.appendChild(stats.dom);

    // Animation Loop
    let frameId;
    const animate = () => {
      frameId = requestAnimationFrame(animate);

      stats.update();
      controls.update();

      renderer.render(scene, camera);
    };
    animate();

    // Resize Handler
    const handleResize = () => {
      camera.aspect = window.innerWidth / window.innerHeight;
      camera.updateProjectionMatrix();
      renderer.setSize(window.innerWidth, window.innerHeight);
    };
    window.addEventListener('resize', handleResize);

    // Cleanup
    return () => {
      cancelAnimationFrame(frameId);
      window.removeEventListener('resize', handleResize);
      renderer.dispose();
      boxGeometry.dispose();
      faceMaterials.forEach(m => m.dispose());
    };
  }, []);

  return (
    <div>
      <canvas id="mythreejscanvas" />
    </div>
  );
}

export default App;
