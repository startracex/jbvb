import { BaseButton, SignForm } from "godown/out/react";
import { useState } from "react";
import { alert } from "@/lib/utils/alert";
import dynamic from "next/dynamic";
const SignFormSSG = dynamic(() => Promise.resolve(SignForm), { ssr: false });
export default () => {
  const [set, setSet] = useState(2);
  if (typeof window !== "undefined") {
    const nv = document.querySelector("#nv");
    if (nv) {
      nv.addEventListener("click", () => {
        var v = document.querySelector("sign-form")?.namevalue();
        alert({
          title: "namevalue()",
          content: JSON.stringify(v),
        });
      });
    }
    const fd = document.querySelector("#fd");
    if (fd) {
      fd.addEventListener("click", () => {
        var v = document.querySelector("sign-form")?.FormData();
        // 将FormData变为对象
        alert({
          title: "FormData()",
          content: v,
          autoclose: 0,
        });
        alert({
          title: "FormData() To String",
          content:
            JSON.stringify(Object.fromEntries(v.entries()))
          ,
          autoclose: 0,
        });
      });
    }
  }
  return (
    <div className="play">
      <main style={{ display: "flex" }}>
        <SignFormSSG name="default" set={set} >
          html input <input name="htmlinput" type="text" />
        </SignFormSSG>
      </main>
      <hr />
      <BaseButton onClick={() => {
        setSet(set == 2 ? 0 : 2);
      }} >set={set}</BaseButton>
      <BaseButton id="fd">FormData()</BaseButton>
      <BaseButton id="nv">namevalue()</BaseButton>
    </div>
  );
};