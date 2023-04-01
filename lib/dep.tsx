type deptype = {
  root: string;
  src: {
    label: string;
    url?: string;
    children?: {
      label: string;
      url: string;
    }[];
  }[];
};
export const basepath="/jbvb"
const dep: deptype[] = [
  {
    root: "zh",
    src: [
      {
        label: "概述",
        url: "/"
      },
      {
        label: "输入/表单",
        url: "/input-form",
        children: [
          {
            label: "基本输入",
            url: "/base-input"
          },
          {
            label: "基本输入(拓展)",
            url: "/exp-input"
          },
          {
            label: "标签包含输入",
            url: "/label-input"
          },
          {
            label: "分割输入",
            url: "/split-input"
          },
          {
            label: "布尔输入",
            url: "/switch-input"
          },
          {
            label: "选择输入",
            url: "/select-input"
          },
          {
            label: "登入表单",
            url: "/sign-form"
          },
          {
            label: "搜索输入",
            url: "/search-input"
          },
          {
            label: "网络搜索",
            url: "/search-w"
          }
        ]
      },
      {
        label: "布局",
        url: "/layout",
        children: [
          {
            label: "导航布局",
            url: "/nav-layout"
          },
          {
            label: "导航布局(侧栏)",
            url: "/aside-nav"
          },
          {
            label: "下拉栏",
            url: "/down-drop"
          },
          {
            label: "Flex流",
            url: "/flex-flow"
          },
          {
            label: "拖动框",
            url: "/drag-box"
          },
          {
            label: "分割线",
            url: "/split-line"
          }
        ]
      },
      {
        label: "单体元素",
        url: "/items",
        children: [
          {
            label: "个人组件",
            url: "/avatar-anchor"
          },
          {
            label: "按钮",
            url: "/base-button"
          },
          {
            label: "呼出栏",
            url: "/call-item"
          },
          {
            label: "详情拓展",
            url: "/details-item"
          },
          {
            label: "读取轨道",
            url: "/load-track"
          },
          {
            label: "菜单列表",
            url: "/menu-list"
          },
          {
            label: "链接锚点",
            url: "/super-a"
          }
        ]
      },
      {
        label: "组元素",
        url: "/group",
        children: [
          {
            label: "个人组件组",
            url: "/avatar-group"
          },
          {
            label: "按钮组",
            url: "/button-group"
          },
          {
            label: "详情拓展组",
            url: "/details-group"
          }
        ]
      },
      {
        label: "效果",
        url: "/effect",
        children: [
          {
            label: "呼吸过载",
            url: "/ov-effect"
          },
          {
            label: "轮播",
            url: "/ro-effect"
          },
          {
            label: "打字机",
            url: "/tw-effect"
          }
        ]
      },
      {
        label: "React",
        url: "/react"
      },
      {
        label: "主页",
      }
    ]
  }
  ,
  {
    root: "en",
    src: [
      {
        label: "Overview",
        url: "/"
      },
      // {
      //   label: "Input/Form",
      //   url: "/input-form",
      //   children: [
      //     {
      //       label: "Base Input",
      //       url: "/base-input"
      //     },
      //     {
      //       label: "Base Input(Exp)",
      //       url: "/exp-input"
      //     },
      //     {
      //       label: "Split Input",
      //       url: "/split-input"
      //     },
      //     {
      //       label: "Switch Input",
      //       url: "/switch-input"
      //     },
      //     {
      //       label: "Select Input",
      //       url: "/select-input"
      //     },
      //     {
      //       label: "Sign Form",
      //       url: "/sign-form"
      //     },
      //     {
      //       label: "Search Input",
      //       url: "/search-input"
      //     }
      //   ]
      // },
      // {
      //   label: "Layout",
      //   url: "/layout",
      //   children: [
      //     {
      //       label: "Nav Layout",
      //       url: "/nav-layout"
      //     },
      //     {
      //       label: "Nav Layout(Aside)",
      //       url: "/aside-nav"
      //     },
      //     {
      //       label: "Down Drop",
      //       url: "/down-drop"
      //     },
      //     {
      //       label: "Flex Flow",
      //       url: "/flex-flow"
      //     },
      //     {
      //       label: "Drag Box",
      //       url: "/drag-box"
      //     },
      //     {
      //       label: "Split Line",
      //       url: "/split-line"
      //     }
      //   ]
      // },
      // {
      //   label: "Items",
      //   url: "/items",
      //   children: [
      //     {
      //       label: "Avatar Anchor",
      //       url: "/avatar-anchor"
      //     },
      //     {
      //       label: "Base Button",
      //       url: "/base-button"
      //     },
      //     {
      //       label: "Call Item",
      //       url: "/call-item"
      //     },
      //     {
      //       label: "Details Item",
      //       url: "/details-item"
      //     },
      //     {
      //       label: "Load Track",
      //       url: "/load-track"
      //     },
      //     {
      //       label: "Menu List",
      //       url: "/menu-list"
      //     },
      //     {
      //       label: "Super Anchor",
      //       url: "/super-a"
      //     }
      //   ]
      // },
      // {
      //   label: "Group",
      //   url: "/group",
      //   children: [
      //     {
      //       label: "Avatar Group",
      //       url: "/avatar-group"
      //     },
      //     {
      //       label: "Button Group",
      //       url: "/button-group"
      //     },
      //     {
      //       label: "Details Group",
      //       url: "/details-group"
      //     }
      //   ]
      // },
      // {
      //   label: "Effect",
      //   url: "/effect",
      //   children: [
      //     {
      //       label: "Over Breath",
      //       url: "/ov-effect"
      //     },
      //     {
      //       label: "Rolling",
      //       url: "/ro-effect"
      //     },
      //     {
      //       label: "Typewriter",
      //       url: "/tw-effect"
      //     }
      //   ]
      // },
      {
        label: "React",
        url: "/react"
      },
      {
        label: "Home",
      }
    ]
  },
  {
    root: "ru",
    src: [
      {
        label: "Обзор",
        url: "/"
      },
      // {
      //   label: "Ввод/Форма",
      //   url: "/input-form",
      //   children: [
      //     {
      //       label: "Базовый ввод",
      //       url: "/base-input"
      //     },
      //     {
      //       label: "Базовый ввод(Exp)",
      //       url: "/exp-input"
      //     },
      //     {
      //       label: "Разделенный ввод",
      //       url: "/split-input"
      //     },
      //     {
      //       label: "Переключатель ввода",
      //       url: "/switch-input"
      //     },
      //     {
      //       label: "Выбор ввода",
      //       url: "/select-input"
      //     },
      //     {
      //       label: "Форма входа",
      //       url: "/sign-form"
      //     },
      //     {
      //       label: "Поиск ввода",
      //       url: "/search-input"
      //     }
      //   ]
      // },
      // {
      //   label: "Макет",
      //   url: "/layout",
      //   children: [
      //     {
      //       label: "Макет навигации",
      //       url: "/nav-layout"
      //     },
      //     {
      //       label: "Макет навигации(Aside)",
      //       url: "/aside-nav"
      //     },
      //     {
      //       label: "Спуск вниз",
      //       url: "/down-drop"
      //     },
      //     {
      //       label: "Поток флекса",
      //       url: "/flex-flow"
      //     },
      //     {
      //       label: "Перетаскивание",
      //       url: "/drag-box"
      //     },
      //     {
      //       label: "Разделительная линия",
      //       url: "/split-line"
      //     }
      //   ]
      // },
      // {
      //   label: "Элементы",
      //   url: "/items",
      //   children: [
      //     {
      //       label: "Аватарная якорь",
      //       url: "/avatar-anchor"
      //     },
      //     {
      //       label: "Базовая кнопка",
      //       url: "/base-button"
      //     },
      //     {
      //       label: "Звонок элемент",
      //       url: "/call-item"
      //     },
      //     {
      //       label: "Детали элемента",
      //       url: "/details-item"
      //     },
      //     {
      //       label: "Загрузить трек",
      //       url: "/load-track"
      //     },
      //     {
      //       label: "Список меню",
      //       url: "/menu-list"
      //     },
      //     {
      //       label: "Супер якорь",
      //       url: "/super-a"
      //     }
      //   ]
      // },
      // {
      //   label: "Группа",
      //   url: "/group",
      //   children: [
      //     {
      //       label: "Аватарная группа",
      //       url: "/avatar-group"
      //     },
      //     {
      //       label: "Кнопка группы",
      //       url: "/button-group"
      //     },
      //     {
      //       label: "Детали группы",
      //       url: "/details-group"
      //     }
      //   ]
      // },
      // {
      //   label: "Эффект",
      //   url: "/effect",
      //   children: [
      //     {
      //       label: "Дыхание над",
      //       url: "/ov-effect"
      //     },
      //     {
      //       label: "Катание",
      //       url: "/ro-effect"
      //     },
      //     {
      //       label: "Печатный станок",
      //       url: "/tw-effect"
      //     }
      //   ]
      // },
      {
        label: "React",
        url: "/react"
      },
      {
        label: "дом"
      }
    ]
  }
];
export default dep; 