import { AlertItem } from "godown";

export function alert(props: any) {
  let aig = document.querySelector(".alert-item-group");
  if (!aig) {
    aig = document.createElement("div");
    aig.classList.add("alert-item-group");
    document.body.appendChild(aig);
  }
  let ai = new AlertItem;
  ai.classList.add("alert-item");
  ai.title = props.title;
  ai.content = props.content;
  ai.autoclose = props.autoclose;
  ai.call = props.call || "info";
  aig.appendChild(ai);
}