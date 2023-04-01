import { BaseButton } from "godown/out/react";
import { useState } from "react";
const colormap = [
  "unset",
  "black",
  "red",
  "white",
  "blue",
  "green",
  "yellow",
];
export default () => {
  const [ghost, setGhost] = useState(false);
  return (
    <div className="play">
      <main style={{ display: "flex" }}>
        {
          colormap.map((color, i) => {
            return (
              <BaseButton color={color} ghost={ghost} >
                color={color}
                {ghost ? " ghost=true" : ""}
              </BaseButton>
            );
          })
        }
        <BaseButton href="/" target="_blank">href="/" target="_blank"</BaseButton>
        <BaseButton disabled >disabled</BaseButton>
      </main>
      <hr />
      <BaseButton color="black" onClick={() => {
        setGhost(!ghost);
      }} >{ghost ? "Disable " : "Enable "}Ghost</BaseButton>
    </div>
  );
};