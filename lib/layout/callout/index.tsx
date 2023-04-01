export default function Callout(props:any) {
  return (
    <div style={{
      backgroundColor: "#3b4e70",
      fontSize: "26px",
      padding: "8px 18px",
      textAlign: "center",
      borderRadius: "6px",
      borderBottom: "2.2px solid #00b6ff"
    }} >
      {props.children}
    </div>
  );
}