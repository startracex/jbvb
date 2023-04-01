import { DetailsItem, SuperAnchor } from "godown/out/react";
import dep from "@/lib/dep";
// 从next.config.js中导入basepath
import { basepath } from "@/lib/dep";

export default (props: any) => {
  let lang: "zh" | "en" | "ru" = props.lang;
  let rootsupera: any;
  for (let i of dep) {
    console.log(lang, i.root);

    if (lang == i.root) {
      rootsupera = i.src;
    }
  }
  const bp = basepath + "/";

  return rootsupera?.map((item: { label: string, url: string, children: any; }, index: number) => {
    if (item.children) {
      return <DetailsItem key={index} summary={item.label} >
        {item.children.map((child: any, index: number) => {
          return <SuperAnchor key={index} href={bp + lang + item.url + child.url} >{child.label}</SuperAnchor>;
        })}
      </DetailsItem>;
    } else if (item.url) {
      return <SuperAnchor key={index} href={bp + lang + item.url} >{item.label}</SuperAnchor>;
    } else {
      return <SuperAnchor key={index} href={bp} >{item.label}</SuperAnchor>;
    }
  });
};