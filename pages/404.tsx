import { useEffect } from "react";
import dynamic from 'next/dynamic';
// 在nossr中渲染组件
const TWText = dynamic(() => import("godown/out/react").then((mod) => mod.TWText), { ssr: false });
export default () => {
  useEffect(() => {
    setTimeout(() => {
      window.location.href = "/";
    }, 4800);
  }, [typeof window]);
  return (
    <>
      <div style={{ height: "100%", display: "flex", flexDirection: "column", alignItems: "center", justifyContent: "center" }}>
        <TWText style={{ whiteSpace: "break-spaces", width: "9.8em", height: "2em", display: "block" }} autochange={50}>
          Page Not Found.    Redirecting to "/"
        </ TWText>
      </div>
    </>
  );
};