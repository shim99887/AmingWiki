<template>
  <div class="wrap">
    <div>
      <h1>글쓰기</h1>
    </div>
    <div class="form">
      <h3>카테고리</h3>
      <select name="category" id="menu1"></select>
      <select name="category" id="menu2"></select>
    </div>
    <div class="form">
      <h3>제목</h3>
      <input type="text" id="title" />
    </div>
    <!-- toast ui editor 활용 -->
    <editor />
    <div id="btnGrp">
      <div id="ok" class="btn">
        <span>등록</span>
      </div>
      <div id="cancle" class="btn">
        <span>취소</span>
      </div>
    </div>
  </div>
</template>
<script>
import "@toast-ui/editor/dist/toastui-editor.css";
import { Editor } from "@toast-ui/vue-editor";

export default {
  components: {
    editor: Editor,
  },
};
</script>
<style scoped>
.wrap {
  width: 60%;
  margin: 0 auto;
  min-width: 500px;
}
h1 {
  width: 200px;
  text-align: center;
  margin: 48px auto;
  font-size: 1.3em;
  font-weight: 700;
  line-height: 2em;
}
.form {
  margin-bottom: 32px;
}
.form > h3 {
  padding: 4px 0;
}
.form > select,
.form > input {
  height: 32px;
}
.form > select {
  width: 200px;
}
#menu1 {
  margin-right: 28px;
}
.form > input {
  width: 100%;
}
#btnGrp {
  width: 100%;
  height: 44px;
  margin: 80px 0;
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
