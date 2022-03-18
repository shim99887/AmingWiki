<template>
  <div id="app">
    <top-bar />
    <!-- <login-form /> -->
    <!-- <description-form /> -->
    <create-form />
    <!-- <user-form /> -->
  </div>
</template>
<script>
import TopBar from "@/components/topBar.vue";
// import LoginForm from "@/components/loginForm.vue";
// import DescriptionForm from "@/components/descriptionForm.vue";
import CreateForm from "@/components/createForm.vue";
// import UserForm from "@/components/userForm.vue";

export default {
  components: {
    TopBar,
    // LoginForm,
    // DescriptionForm,
    CreateForm,
    // UserForm,
  },
};
</script>
<style>
@import "./assets/css/reset.css";
@import url("https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css");
</style>
