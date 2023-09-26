import Tarea from "./components/Tarea";
import React, { useState } from "react";
import "./App.css";

function App() {
  const [tareas, setTareas] = useState([
    { id: 1, tarea: "Terminar proyecto de React", completada: false },
    { id: 2, tarea: "Estudiar para el examen", completada: true },
    { id: 3, tarea: "Hacer ejercicio", completada: false },
  ]);
  //const tareas = [
  // { id: 1, tarea: "Terminar proyecto de React", completada: false },
  //{ id: 2, tarea: "Estudiar para el examen", completada: true },
  //{ id: 3, tarea: "Hacer ejercicio", completada: false },
  //];
  const marcarTareaCompletada = (id) => {
    const nuevaListaTareas = tareas.map((tarea) => {
      if (tarea.id === id) {
        return { ...tarea, completada: !tarea.completada };
      }
      return tarea;
    });
    setTareas(nuevaListaTareas);
  };
  return (
    <div>
      <h1>Lista de Tareas</h1>
      {tareas.map((tarea) => (
        <Tarea
          key={tarea.id}
          tarea={tarea.tarea}
          completada={tarea.completada}
          marcarCompletada={() => marcarTareaCompletada(tarea.id)}
        />
      ))}
    </div>
  );
}

export default App;
