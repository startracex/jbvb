import Head from 'next/head';
import { OVText, OVButton, FlexFlow, ButtonGroup, BaseButton } from "godown/out/react";
import { useEffect } from 'react';
import { AlertItem } from 'godown';
import Link from 'next/link';
export default function Home() {
  let cp = () => { };
  useEffect(() => {
    cp = () => {
      copyUseAlertItem("npm i godown", "Copied", "Copy failed");
    };
  }, []);
  return (
    <>
      <Head>
        <title>Index of godown-c</title>
      </Head>
      <FlexFlow style={{ height: "100%"}} className='col'>
        <OVText style={{ margin: "1rem", fontSize: "clamp(3.2rem, 9vw, 4.6rem)" }} t1="Godown" t2="Components" t3="Manual"></OVText>
        <div title="Copy">
          <OVButton onClick={() => cp()} >
          <div style={{ fontSize: "24px", padding: "8px"}} >npm i godown</div>
        </OVButton>
        </div>
        <ButtonGroup style={{ borderRadius: "2em", margin: " 2rem" }}>
          <BaseButton>
            <Link style={{ padding: ".5rem" }} href="/en">English</Link>
          </BaseButton>
          <BaseButton>
            <Link style={{ padding: ".5rem" }} href="/zh">简体中文</Link>
          </BaseButton>
          <BaseButton>
            <Link style={{ padding: ".5rem" }} href="/ru">Русский</Link>
          </BaseButton>
        </ButtonGroup>
      </FlexFlow>
    </>
  );
}
function copyUseAlertItem(content: string, tips: string, failed: string) {
  if (navigator.clipboard && window.isSecureContext) {
    let ai = new AlertItem;
    ai.autoclose = 1500;
    ai.classList.add("alert-item");
    navigator.clipboard.writeText(content).then(
      () => {
        ai.title = tips;
      },
      () => {
        ai.title = failed;
      },
    );
    document.body.appendChild(ai);
  }
}

