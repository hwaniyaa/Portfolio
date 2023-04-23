function joinForm(clickBtn, modalBox, closeBtn){
  let click = clickBtn;
  let box = modalBox;
  let close = closeBtn;

  $(close).click(()=>{
    $(box).removeClass("openBox");
  });
  $(click).click(()=>{
    $(box).addClass("openBox");
  });
};

function Register() {
  $("#clickRegister").on("click", function(){
    $("#modalBoxLogin").removeClass("openBox");
    $("#modalBoxjoin").addClass("openBox");
  });
  $("#clickLogin").on("click", function(){
    $("#modalBoxjoin").removeClass("openBox");
    $("#modalBoxLogin").addClass("openBox");
  });
};

