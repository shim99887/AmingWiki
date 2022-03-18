<template>
  <div class="container">
    <div class="wrap">
      <h1>LOGIN</h1>
      <form>
        <input type="text" id="id" />
        <input type="password" id="password" />
      </form>
      <dir id="loginBtn">
        <span>LOGIN</span>
      </dir>
    </div>
  </div>
</template>
<script>
export default {};
</script>
<style scoped>
.container {
  height: calc(100vh - 77px);
  position: relative;
}
.wrap {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 500px;
  height: 440px;
  border: 1px solid #d4d4d4;
}

h1 {
  width: 100px;
  text-align: center;
  margin: 60px auto;
  font-size: 1.3em;
  font-weight: 700;
}

input {
  width: 400px;
  display: block;
  margin: 0 auto;
  height: 48px;
  border: 1px solid #d4d4d4;
  background-color: transparent;
  box-sizing: border-box;
}

input:first-child {
  border-radius: 10px 10px 0 0;
}

input:last-child {
  border-radius: 0 0 10px 10px;
  border-top: none;
}

input:focus {
  outline: none;
}

#loginBtn {
  width: 400px;
  height: 44px;
  background-color: rgb(43, 48, 99);
  color: white;
  text-align: center;
  line-height: 44px;
  margin: 60px auto 40px;
  padding: 0;
  cursor: pointer;
}
</style>
