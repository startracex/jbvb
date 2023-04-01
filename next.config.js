/** @type {import('next').NextConfig} */
const nextConfig = require('@next/mdx')({
  extension: /\.mdx?$/,
});
module.exports = nextConfig(
  {
    pageExtensions: ["mdx", "tsx", 'md'],
    basePath: "/jbvb",
  }
);