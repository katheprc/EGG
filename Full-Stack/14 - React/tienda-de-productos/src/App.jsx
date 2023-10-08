import "./App.css";
import Product from "./components/producto.jsx";

function App() {
  return (
    <>
      <h1>STORE</h1>
      {Product("https://fakestoreapi.com/products")}
    </>
  );
}

export default App;
