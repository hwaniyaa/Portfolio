
  let onClick = document.querySelectorAll(".onClick");

  function handleClick(event) {
    // div에서 모든 "click" 클래스 제거
    onClick.forEach((e) => {
      e.classList.remove("clickColor");
    });
    // 클릭한 div만 "click"클래스 추가
    event.target.classList.add("clickColor");
  }
  
  onClick.forEach((e) => {
    e.addEventListener("click", handleClick);
  });

  Splitting({
    target: "[data-splitting]",
    by: "chars",
    key: null
  });









 