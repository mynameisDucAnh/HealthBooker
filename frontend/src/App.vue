<template>
  <div id="app">
    <!-- <NavbarUserVue />
    <HeroUserVue />
    <DoctorUserVue />
    <HospitalUserVue />
    <AdviseUserVue />
    <FooterUserVue /> -->
     <router-view name="navbar"></router-view>
    <router-view name="hero"></router-view>
    <router-view name="doctor"></router-view>
    <router-view name="hospital"></router-view>
    <router-view name="advise"></router-view>
    <router-view></router-view> <!-- default view -->
    <router-view name="footer"></router-view>
  </div>
</template>

<script>

export default {
  name: "App",
  components: {

  },
};
</script>
<style src="./assets/css/reset.css"></style>
<style>
* {
  box-sizing: border-box;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
.main-content {
  width: 1170px;
  max-width: calc(100% - 48px);
  margin-left: auto;
  margin-right: auto;
}
:root {
  --primary-color: #ffb900;
  --font-heading: Sen, sans-serif;
}

html {
  font-size: 62.5%;
  scroll-behavior: smooth;
}

body {
  font-size: 1.6rem;
  font-family: "Poppins", sans-serif;
}

/* Common */
a {
  text-decoration: none;
  text-align: left;
}
li {
  text-align: left;
}
h3 {
  text-align: left;
}
p {
  text-align: left;
}
.btn {
  display: inline-block;
  min-width: 118px;
  padding: 0 8px;
  line-height: 50px;
  font-weight: 600;
  /* font-size: 1.6rem; */
  text-align: center;
  color: #ffffff;
  background: #171100;
  border-radius: 999px;
}

.btn:hover {
  opacity: 0.9;
  cursor: pointer;
}
.logo {
  width: 48px;
}
.heading {
  font-family: var(--font-heading);
  font-weight: 700;
  letter-spacing: -0.02em;
  color: #171100;
}
.heading.lv1 {
  font-size: 4.8rem;
  line-height: 1.17;
  text-align: left;
}

.heading.lv2 {
  font-size: 3.8rem;
  line-height: 1.26;
  text-align: left;
}

.main-content {
  width: 1070px;
  max-width: calc(100% - 48px);
  margin-left: auto;
  margin-right: auto;
}

.line-clamp {
  display: -webkit-box;
  -webkit-line-clamp: var(--line-clamp, 1);
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.line-clamp.line-2 {
  --line-clamp: 2;
}

.break-all {
  word-break: break-all;
}
</style>
