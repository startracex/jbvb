# React

Godown доступен в большинстве платформ семейства React

## Установка

```bash
npm install godown
```

## Импорт

Возьмем в качестве примера base-button

```jsx
import { BaseButton } from "godown/out/react";
```

## Использование

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
