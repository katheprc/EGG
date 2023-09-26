function calculator() {
  return (
    <>
      <div>

        <div className="visor">
            <textarea name="" id="textArea" cols="30" rows="10">

            </textarea>
        </div>

        <div className="botones">

             <button value={1} className="boton" onClick={vista}>1</button>
            <button value={2} className="boton" onClick={vista}>2</button>
            <button value={3} className="boton" onClick={vista}>3</button>
            <button value={4} className="boton" onClick={vista}>4</button>
            <button value={5} className="boton" onClick={vista}>5</button>
            <button value={6} className="boton" onClick={vista}>6</button>
            <button value={7} className="boton" onClick={vista}>7</button>
            <button value={8} className="boton" onClick={vista}>8</button>
            <button value={9} className="boton" onClick={vista}>9</button>
            <button value={0} className="boton" onClick={vista}>0</button>

        </div>

      </div>
    </>
  );
}

function calcu(){
    const num = document.getElementsByClassName("boton").value;
    return num;
}

function vista(){
    document.getElementById("textArea").innerText = document.querySelector("boton").addEventListener('click', function(calcu));
}

export default calculator;
