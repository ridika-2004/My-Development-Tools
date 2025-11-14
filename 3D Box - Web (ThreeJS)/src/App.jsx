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
    camera.position.set(0, 0, 5);

    // Renderer
    const renderer = new THREE.WebGLRenderer({
      canvas,
      antialias: true,
      alpha: true,
    });
    renderer.setSize(window.innerWidth, window.innerHeight);
    renderer.setClearColor(0x000000, 0);

    // Lights
    const ambientLight = new THREE.AmbientLight(0xffffff, 0.8);
    scene.add(ambientLight);

    // ============================
    //         2D AXES
    // ============================

    // X axis (red)
    const xPoints = [new THREE.Vector3(-5, 0, 0), new THREE.Vector3(5, 0, 0)];
    const xGeometry = new THREE.BufferGeometry().setFromPoints(xPoints);
    const xMaterial = new THREE.LineBasicMaterial({ color: 0xff0000 });
    const xAxis = new THREE.Line(xGeometry, xMaterial);
    scene.add(xAxis);

    // Y axis (green)
    const yPoints = [new THREE.Vector3(0, -5, 0), new THREE.Vector3(0, 5, 0)];
    const yGeometry = new THREE.BufferGeometry().setFromPoints(yPoints);
    const yMaterial = new THREE.LineBasicMaterial({ color: 0x00ff00 });
    const yAxis = new THREE.Line(yGeometry, yMaterial);
    scene.add(yAxis);

    // Optional: plane grid (faint)
    const grid = new THREE.GridHelper(10, 10, 0x444444, 0xdddddd);
    grid.rotation.x = Math.PI / 2; // rotate into the X-Y plane
    scene.add(grid);

    // ============================

    // Controls
    const controls = new OrbitControls(camera, renderer.domElement);

    // Stats
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

      xGeometry.dispose();
      xMaterial.dispose();
      yGeometry.dispose();
      yMaterial.dispose();
    };
  }, []);

  return (
    <div>
      <canvas id="mythreejscanvas" />
    </div>
  );
}

export default App;
