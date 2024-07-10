<template>
  <div class="hero">
    <div class="main-content">
      <div class="body">
        <!-- Hero left -->
        <div class="media-block">
          <img
            src="../../assets/img/hero-img.jpg"
            alt="Learn without limits and spread knowledge."
            class="img"
          />

          <div class="hero-summary">
            <div class="item">
              <div class="icon">
                <img src="../../assets/icons/circle-user-solid.svg" alt="" />
              </div>
              <div class="info">
                <p class="label">Hơn 600 bác sĩ</p>
                <p class="title">Chuyên Nghiệp</p>
              </div>
            </div>
            <div class="item">
              <div class="icon">
                <img src="../../assets/icons/city-solid.svg" alt="" />
              </div>
              <div class="info">
                <p class="label">25 bệnh viện thiết bị</p>
                <p class="title">Hiện Đại</p>
              </div>
            </div>
            <div class="item">
              <div class="icon">
                <img src="../../assets/icons/phone-solid.svg" alt="" />
              </div>
              <div class="info">
                <p class="label">Đội ngũ tư vấn</p>
                <p class="title">Tận Tình</p>
              </div>
            </div>
          </div>
        </div>

        <!-- Hero right -->
        <div class="content-block">
          <h1 class="heading lv1">Ứng dụng đặt khám</h1>
          <p class="desc">
            Đặt phòng khám và được tư vấn bởi các chuyên gia với hơn 600 bác sĩ,
            25 bệnh viện, 100 phòng khám
          </p>
          <div class="cta-group">
            <a href="#book" class="btn hero-cta">Đặt khám ngay</a>
            <button class="advise">
              <div class="icon">
                <img src="../../assets/icons/whatsapp.svg" alt="" />
              </div>
              <span><a href="#provise">Tư vấn Online</a></span>
            </button>
          </div>
          <p class="desc">Tự hào với</p>
          <p class="desc stats">
            <strong>50K</strong> bệnh nhân tin tưởng<br />
            <strong>20+</strong> thành tựu lớn
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.hero {
  padding: 56px 0 65px;
  background: #0ca3d2;
}

.hero .body {
  display: flex;
}

/* Hero left */
.hero .media-block {
  position: relative;
  width: 48%;
}

.hero .media-block .img {
  display: block;
  width: 470px;
  height: 685px;
  object-fit: cover;
  border-radius: 20px;
  object-position: top;
}

.hero-summary {
  position: absolute;
  right: 0;
  bottom: 48px;
  width: 270px;
  padding: 24px;
  background: #ffffff;
  box-shadow: 0px 16px 32px rgba(0, 0, 0, 0.05);
  border-radius: 12px;
}

.hero-summary .item {
  display: flex;
  align-items: center;
}

.hero-summary .item + .item {
  margin-top: 22px;
}

.hero-summary .icon {
  width: 48px;
  height: 48px;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: #fff9e8;
}

.hero-summary .item:nth-of-type(2) .icon {
  background: #fcefff;
}

.hero-summary .item:nth-of-type(3) .icon {
  background: #ebeaff;
}

.hero-summary .info {
  margin-left: 16px;
}

.hero-summary .label {
  font-size: 1.4rem;
  line-height: 1.86;
  color: #5f5b53;
}

.hero-summary .title {
  font-weight: 600;
  font-size: 1.8rem;
  line-height: 1.67;
  color: #171100;
}

/* Hero right */
.hero .content-block {
  width: 52%;
  padding: 64px 0 0 130px;
}

.hero .desc {
  margin-top: 22px;
  font-size: 1.8rem;
  line-height: 1.67;
  color: #5f5b53;
  text-align: left;
}

.hero .cta-group {
  display: flex;
  align-items: center;
  margin: 38px 0 48px;
}

.hero-cta {
  min-width: 180px;
  line-height: 64px;
  background-color: var(--primary-color);
}

.hero .advise {
  display: flex;
  align-items: center;
  margin-left: 28px;
  border: none;
  background: transparent;
  cursor: pointer;
}

.hero .advise .icon {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 40px;
  height: 40px;
  border-radius: 50%;
  background: #ffffff;
  box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.07);
}

.hero .advise span {
  margin-left: 14px;
  font-weight: 600;
  font-size: 1.8rem;
  line-height: 1.67;
  color: #171100;
}

.hero .stats {
  margin: 8px 0 0 -28px;
}

.hero .stats strong {
  padding: 0 8px 0 28px;
  font-family: var(--font-heading);
  font-weight: 700;
  font-size: 3.4rem;
  line-height: 1.23;
  color: #171100;
}
</style>