# React

Godown is available in most React family frameworks

## Installation

```bash
npm install godown
```

## Import

Take base-button as an example

```jsx
import { BaseButton } from "godown/out/react";
```

## Usage

Example, showing a base-button

```jsx
export default () => {
  return (
    <BaseButton
      onClick={() => {
        alert("click");
      }}
    >
      Click me
    </BaseButton>
  );
};
```
