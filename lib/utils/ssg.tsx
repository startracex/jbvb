import fs from 'fs';
import path from 'path';
import dep from '../dep';
const docsDirectory = path.join("docs", "./");
export function getUrls(pre: string) {
  const arr: string[] = [];
  for (const v of dep) {
    if (pre == v.root) {
      for (const item of v.src) {
        if (item.children) {
          for (const child of item.children) {
            arr.push("/" + pre + item.url + child.url);
          }
        } else {
          if (item.url && item.url[item.url.length - 1] != "/") {
            arr.push("/" + pre + item.url);
          }
        }
      }
    }
  }
  return arr;
}

export function getContent(filepath: any) {
  const fullPath = path.join(docsDirectory, `${filepath}.md`);
  const fileContent = fs.readFileSync(fullPath, 'utf8');
  return fileContent;
}