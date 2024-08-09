<template>
  <div id="registration">
    <div class="container">
      <input type="checkbox" id="flip" />
      <div class="cover">
        <div class="front">
          <img src="../assets/img/anhNenLogin.jpeg" alt="" />
          <div class="text">
            <!-- Nội dung khác -->
          </div>
        </div>
        <div class="back">
          <img src="../assets/img/anhNenLogin.jpeg" alt="" />
          <div class="text">
            <!-- Nội dung khác -->
          </div>
        </div>
      </div>
      <div class="forms">
        <div class="form-content">
          <div class="login-form">
            <div class="title">Đăng nhập</div>
            <form @submit.prevent="handleLogin">
              <div class="input-boxes">
                <div class="input-box">
                  <i class="fas fa-envelope"></i>
                  <input
                    type="text"
                    v-model="login.phoneNumber"
                    placeholder="Enter your phone number"
                    required
                  />
                </div>
                <div class="input-box">
                  <i class="fas fa-lock"></i>
                  <input
                    type="password"
                    v-model="login.password"
                    placeholder="Enter your password"
                    required
                  />
                </div>
                <div class="text"><a href="#">Forgot password?</a></div>
                <div class="button input-box">
                  <input type="submit" value="Submit" />
                </div>
                <div class="text sign-up-text">
                  Bạn chưa có tài khoản <label for="flip">Đăng ký ngay</label>
                </div>
              </div>
            </form>
          </div>
          <div class="signup-form">
            <div class="title">Đăng ký</div>
            <form @submit.prevent="handleSignup">
              <div class="input-box">
                <i class="fas fa-user"></i>
                <input
                  type="text"
                  v-model="signup.fullName"
                  placeholder="Enter your name"
                  required
                />
              </div>
              <div class="input-box">
                <i class="fas fa-envelope"></i>
                <input
                  type="text"
                  v-model="signup.phoneNumber"
                  placeholder="Enter your phone number"
                  required
                />
              </div>
              <div class="input-box">
                <i class="fas fa-home"></i>
                <input
                  type="text"
                  v-model="signup.address"
                  placeholder="Enter your address"
                  required
                />
              </div>
              <div class="input-box">
                <i class="fas fa-lock"></i>
                <input
                  type="password"
                  v-model="signup.password"
                  placeholder="Enter your password"
                  required
                />
              </div>
              <div class="input-box">
                <i class="fas fa-lock"></i>
                <input
                  type="password"
                  v-model="signup.retypePassword"
                  placeholder="Retype your password"
                  required
                />
              </div>
              <div class="input-box">
                <i class="fas fa-calendar"></i>
                <input
                  type="date"
                  v-model="signup.dateOfBirth"
                  placeholder="Enter your date of birth"
                  required
                />
              </div>
              <div class="button input-box">
                <input type="submit" value="Submit" />
              </div>
              <div class="text sign-up-text">Bạn đã có tài khoản ? <label for="flip">Đăng nhập ngay</label></div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import axios from "axios";
import { API_BASE_URL } from "../api/apiConfig";
import { mapActions } from "vuex";

export default {
  data() {
    return {
      login: {
        phoneNumber: "",
        password: "",
      },
      signup: {
        fullName: "",
        phoneNumber: "",
        address: "",
        dateOfBirth: "",
        password: "",
        retypePassword: "",
        facebookAccountId: 0,
        googleAccountId: 0,
        roleId: 2, // Mặc định là 2
      },
    };
  },
  methods: {
    ...mapActions({
      loginUser: "login", // Đặt tên hành động rõ ràng để tránh xung đột
    }),
    async handleLogin() {
      try {
        // Gọi hành động login từ Vuex
        await this.loginUser({
          phoneNumber: this.login.phoneNumber,
          password: this.login.password,
        });
        this.$router.push("/"); // Chuyển hướng sau khi đăng nhập thành công
      } catch (error) {
        console.error("Login failed:", error.response?.data || error.message);
      }
    },
    async handleSignup() {
      if (this.signup.password !== this.signup.retypePassword) {
        alert("Passwords do not match");
        return;
      }

      try {
        const response = await axios.post(`${API_BASE_URL}/users/register`, {
          fullName: this.signup.fullName,
          phoneNumber: this.signup.phoneNumber,
          address: this.signup.address,
          password: this.signup.password,
          retypePassword: this.signup.retypePassword,
          dateOfBirth: this.signup.dateOfBirth,
          facebookAccountId: 0,
          googleAccountId: 0,
          roleId: 2,
        });
        alert("Signup successful!");
        console.log("Signup response:", response.data);
      } catch (error) {
        alert("Signup failed: " + error.response.data);
      }
    },
  },
};
</script>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap");
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
#registration {
  min-height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  background: #2a7be8;
  background-image: url();
  padding: 30px;
}
.container {
  position: relative;
  max-width: 850px;
  width: 100%;
  background: #fff;
  padding: 40px 30px;
  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
  perspective: 2700px;
}
.container .cover {
  position: absolute;
  top: 0;
  left: 50%;
  height: 100%;
  width: 50%;
  z-index: 98;
  transition: all 1s ease;
  transform-origin: left;
  transform-style: preserve-3d;
}
.container #flip:checked ~ .cover {
  transform: rotateY(-180deg);
}
.container .cover .front,
.container .cover .back {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
}
.cover .back {
  transform: rotateY(180deg);
  backface-visibility: hidden;
}
.container .cover::before,
.container .cover::after {
  content: "";
  position: absolute;
  height: 100%;
  width: 100%;
  background: #7b93f0;
  opacity: 0.5;
  left: 0;
  z-index: 12;
}
.container .cover::after {
  opacity: 0.3;
  transform: rotateY(180deg);
  backface-visibility: hidden;
}
.container .cover img {
  position: absolute;
  height: 100%;
  width: 100%;
  object-fit: cover;
  left: 0;
  z-index: 10;
}
.container .cover .text {
  position: absolute;
  z-index: 130;
  height: 100%;
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.cover .text .text-1,
.cover .text .text-2 {
  font-size: 26px;
  font-weight: 600;
  color: #fff;
  text-align: center;
}
.cover .text .text-2 {
  font-size: 15px;
  font-weight: 500;
}
.container .forms {
  height: 100%;
  width: 100%;
  background: #fff;
}
.container .form-content {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.form-content .login-form,
.form-content .signup-form {
  width: calc(100% / 2 - 25px);
}
.forms .form-content .title {
  position: relative;
  font-size: 24px;
  font-weight: 500;
  color: #333;
}
.forms .form-content .title:before {
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 25px;
  background: #7d2ae8;
}
.forms .signup-form .title:before {
  width: 20px;
}
.forms .form-content .input-boxes {
  margin-top: 30px;
}
.forms .form-content .input-box {
  display: flex;
  align-items: center;
  height: 50px;
  width: 100%;
  margin: 10px 0;
  position: relative;
}
.form-content .input-box input {
  height: 100%;
  width: 100%;
  outline: none;
  border: none;
  padding: 0 30px;
  font-size: 16px;
  font-weight: 500;
  border-bottom: 2px solid rgba(0, 0, 0, 0.2);
  transition: all 0.3s ease;
}
.form-content .input-box input:focus,
.form-content .input-box input:valid {
  border-color: #7d2ae8;
}
.form-content .input-box i {
  position: absolute;
  color: #7d2ae8;
  font-size: 17px;
}
.forms .form-content .text {
  font-size: 14px;
  font-weight: 500;
  color: #333;
}
.forms .form-content .text a {
  text-decoration: none;
}
.forms .form-content .text a:hover {
  text-decoration: underline;
}
.forms .form-content .button {
  color: #fff;
  margin-top: 40px;
}
.forms .form-content .button input {
  color: #fff;
  background: #7d2ae8;
  border-radius: 6px;
  padding: 0;
  cursor: pointer;
  transition: all 0.4s ease;
}
.forms .form-content .button input:hover {
  background: #5b13b9;
}
.forms .form-content label {
  color: #7d2ae8;
  cursor: pointer;
}
.forms .form-content label:hover {
  text-decoration: underline;
}
.forms .form-content .sign-up-text {
  text-align: center;
  margin-top: 30px;
}
.container #flip {
  display: none;
}

@media (max-width: 730px) {
  .container .cover {
    display: none;
  }
  .form-content .login-form,
  .form-content .signup-form {
    width: 100%;
  }
  .form-content .signup-form {
    display: none;
  }
  .container #flip:checked ~ .forms .signup-form {
    display: block;
  }
  .container #flip:checked ~ .forms .login-form {
    display: none;
  }
}
</style>
