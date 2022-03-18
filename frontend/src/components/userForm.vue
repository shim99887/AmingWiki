<template>
  <div class="container">
    <div class="wrap">
      <h1>사용자 등록</h1>
      <ul>
        <li>
          <h3>아이디</h3>
          <input type="text" id="id" />
        </li>
        <li>
          <h3>비밀번호</h3>
          <input type="text" id="password" />
        </li>
        <li>
          <h3>비밀번호 확인</h3>
          <input type="text" id="pwConfirm" />
        </li>
        <li>
          <h3>이름</h3>
          <input type="text" id="name" />
        </li>
        <li id="emailBox">
          <h3>본인 확인 이메일</h3>
          <input type="text" />
          <span>@</span>
          <select name="email" id="email"></select>
        </li>
        <li>
          <h3>권한</h3>
          <select name="auth" id="auth"></select>
        </li>
      </ul>
      <div></div>
      <div id="btnGrp">
        <div class="btn" id="ok">
          <span>등록</span>
        </div>
        <div class="btn" id="cancle">
          <span>취소</span>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {};
</script>
<style scoped>
.container {
  /* height: calc(100vh - 77px); */
  margin-top: 77px;
  padding-bottom: 40px;
}
.wrap {
  width: 60%;
  margin: 0 auto;
  min-width: 500px;
}

h1 {
  width: 100px;
  text-align: center;
  margin: 0 auto;
  padding: 60px 0;
  font-size: 1.3em;
  font-weight: 700;
}

li {
  width: 80%;
  margin: 10px auto 72px;
}

li > input,
li > select {
  width: 100%;
  height: 40px;
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

h3 {
  margin-bottom: 10px;
}

#emailBox > * {
  float: left;
}
#emailBox > h3 {
  float: none;
}
#emailBox::after {
  content: "";
  display: block;
  clear: both;
}
#emailBox > input {
  width: 45%;
  box-sizing: border-box;
}
#emailBox > select {
  width: 45%;
  height: 36px;
}
#emailBox > span {
  width: 10%;
  text-align: center;
  line-height: 36px;
}

li:last-child > select {
  width: 45%;
}
#btnGrp {
  width: 80%;
  height: 44px;
  margin: 80px auto;
  position: relative;
}

.btn {
  width: 48%;
  position: absolute;
  text-align: center;
  height: 44px;
  font-size: 1.1em;
  font-weight: bold;
  box-sizing: border-box;
  line-height: 44px;
  cursor: pointer;
}
.btn:first-child {
  background-color: rgb(43, 48, 99);
  color: white;
  top: 0;
  left: 0;
}
.btn:last-child {
  border: 1px solid rgb(43, 48, 99);
  top: 0;
  right: 0;
}
</style>
