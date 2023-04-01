import '@/public/globals.css'
import '@/public/docs.css'

import type { AppProps } from 'next/app'

export default function App({ Component, pageProps }: AppProps) {
  return (
    <>
    <Component {...pageProps} />
  </>
  );
}
