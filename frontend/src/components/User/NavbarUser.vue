<template>
  <div id="navbaruser">
    <div class="main-content">
      <div class="body">
                <!-- Logo -->
                <img src="../../assets/img/logo2.png" alt="" class="logo" />

                <!-- Nav -->
                <nav class="nav">
                    <ul>
                        <li class="active">
                            <a href="./index.html">Trang chủ</a>
                        </li>
                        <li>
                            <a href="#listdoctoruser">Bác sĩ</a>
                        </li>
                        <li>
                            <a href="#hospital-list">Bệnh viện</a>
                        </li>
                        <li>
                            <a href="#features">Tư vấn</a>
                        </li>
                    </ul>
                </nav>

                <!-- Action -->
                <div class="action">
                    <a href="./sigin.html" class="btn sign-up-btn">Đăng nhập</a>
                </div>
            </div>
  </div>
  </div>
</template>

<script >
export default {

}
</script>

<style scoped>
#navbaruser {
    background: #0ca3d2;

}

#navbaruser.fixed {
    position: sticky;
    top: -28px;
    z-index: 1;
}

#navbaruser .body {
    display: flex;
    align-items: center;
    padding: 36px 0 8px;

}

.nav {
    margin-left: auto;
}

.nav ul {
    display: flex;
}

.nav a {
    position: relative;
    padding: 8px 21px;
    font-size: 1.6rem;
    color: #5f5b53;
}

.nav a:hover,
.nav li.active a {
    text-shadow: 1px 0 0 currentColor;
    color: #171100;
}



#navbaruser .sign-up-btn {
    min-width: 128px;
}

#navbaruser .action {
    margin-left: 49px;
}

</style>