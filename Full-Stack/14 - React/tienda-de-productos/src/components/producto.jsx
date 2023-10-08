import { UseFetch } from "./useFetch.jsx";
import ".././styles/product.css";
import { useState } from "react";

export default function Product(url) {
  const { data } = UseFetch(url);

  const [fav, setFav] = useState(false);

  console.log(data);

  function handleClick() {
    setFav(!fav);
  }

  return (
    <>
      <div className="productsContainer">
        {data?.map((object) => (
          <div key={object.id} className="product">
            <div className="title">
              <h3>{object.title}</h3>
            </div>
            <div className="image">
              <img src={object.image} alt="" />
            </div>
            <div className="description">
              <p>{object.description}</p>
            </div>
            <div className="category">
              <p>{object.category}</p>
            </div>
            <button className="buy">BUY ${object.price}</button>

            {/* <input type="checkbox" checked={fav} onClick={setFav(!fav)}></input> */}
            {/* <button type="button" onClickCapture={handleClick()}>fav</button> */}

            {
                fav ?
                    <button className='favicon' onClick={handleClick}>fav</button>
                    :
                    <button className='favicon' onClick={handleClick}>notfav</button>

            }

          </div>
        ))}
      </div>
    </>
  );
}
