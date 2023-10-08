import "./App.css";

import { BrowserRouter, Routes, Route, Router, Link } from "react-router-dom";
import Inicio from "./components/Inicio";
import AcercaDe from "./components/AcercaDe";
import Contacto from "./components/Contacto";

import Header from "./components/Header";

function App() {
  return (
    <BrowserRouter>
      <Header />

      <Routes>
        <Route exact path="/" element={<Inicio />} />
        <Route exact path="/acerca" element={<AcercaDe />} />
        <Route exact path="/contacto" element={<Contacto />} />
      </Routes>

    </BrowserRouter>
  );
}

export default App;
