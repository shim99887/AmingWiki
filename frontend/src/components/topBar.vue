<template>
  <div class="wrap">
    <div id="logo">
      <img src="" class="center" />
    </div>
    <div>
      <input type="text" id="searchInput" class="center" />
    </div>
    <div>
      <img src="../assets/icons/userIcon.png" id="userIcon" class="center" />
      <span></span>
    </div>
  </div>
</template>
<script>
export default {};
</script>
<style scoped>
.wrap {
  height: 76px;
  border-bottom: 1px solid #d4d4d4;
  position: fixed;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background-color: white;
  z-index: 100;
}
.wrap > div {
  float: left;
  height: 100%;
  position: relative;
}
.wrap > div:nth-child(1) {
  width: 20%;
}
.wrap > div:nth-child(2) {
  width: 60%;
}
#searchInput {
  display: block;
  width: 60%;
  height: 36px;
  border-radius: 20px;
  border: 1px solid #d4d4d4;
  background-image: url("../assets/icons/searchIcon.png");
  background-size: 28px;
  background-repeat: no-repeat;
  background-position: 2% 50%;
}
.wrap > div:nth-child(3) {
  width: 20%;
}
#userIcon {
  display: block;
  width: 32px;
}
.center {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
</style>
