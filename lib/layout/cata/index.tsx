import { AsideNav, DetailsGroup } from "godown/out/react";
import cls from "./cata.module.css";
import dynamic from "next/dynamic";
import { useEffect } from "react";
import { useRef } from "react";
const Cl = dynamic(() => import("./catlist"), { ssr: false });
export default (props: any) => {
  const details:any = useRef();
  useEffect(() => {
    if (document.body.clientWidth > 1400) {
      details.current.setAttribute("open", "");
    }
  }, []);
  return <div className={cls.cata}>
    <AsideNav m="780px">
      <details ref={details}>
        <summary className={cls.summary}>
          <svg viewBox="0 0 48 48" fill="none" ><path d="M7.94971 11.9497H39.9497" stroke="currentColor" strokeWidth="3" strokeLinecap="round" strokeLinejoin="round" /><path d="M7.94971 23.9497H39.9497" stroke="currentColor" strokeWidth="3" strokeLinecap="round" strokeLinejoin="round" /><path d="M7.94971 35.9497H39.9497" stroke="currentColor" strokeWidth="3" strokeLinecap="round" strokeLinejoin="round" /></svg>
        </summary>
        <DetailsGroup only className={cls.list}>
          {
            typeof window !== "undefined" && <Cl lang={props.lang || window.location.pathname.split("/")[2]} />
          }
        </DetailsGroup>
      </details>
    </AsideNav>
    <main className="markdown">
      {props.children}
    </main>
  </div>;
};