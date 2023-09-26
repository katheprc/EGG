import React from "react";

const Tarea = (props) => {
  const { tarea, completada, marcarCompletada } = props;

  return (
    <div>
      <input type="checkbox" checked={completada} onChange={marcarCompletada} />
      <span style={{ textDecoration: completada ? "line-through" : "none" }}>
        {tarea}
      </span>
    </div>
  );
};

export default Tarea;
