<template>
  <div id="hospitalUser">
    <div class="main-content">
      <div class="hospital-top">
        <div class="info">
          <h2 class="heading lv2">Danh sách bệnh viện</h2>
          <p class="desc">Các cở sở được đặt hầu hết mọi nơi trong cả nước</p>
        </div>
        <div class="controls">
          <a href="./hospital.html">Xem thêm</a>
        </div>
      </div>

      <div class="course-list">
        <!-- Course item 1 -->
        <div class="course-item">
          <a href="#!">
            <img
              src="../../assets/img/benhvien1.jpg"
              alt="Basic web design"
              class="thumb"
            />
          </a>
          <div class="info">
            <div class="head">
              <h3 class="title">
                <a href="#!" class="line-clamp break-all">
                  Bệnh viện Nhi TP Đà Nẵng
                </a>
              </h3>
              <div class="rating">
                <img src="../../assets/icons/star.svg" alt="Star" class="star" />
                <span class="value">4.5</span>
              </div>
            </div>
            <div class="foot">
              <button class="btn book-btn">Đặt lịch khám</button>
            </div>
          </div>
        </div>

        <!-- Course item 2 -->
        <div class="course-item">
          <a href="#!">
            <img
              src="../../assets/img/benhvien2.jpg"
              alt="UI/UX design"
              class="thumb"
            />
          </a>
          <div class="info">
            <div class="head">
              <h3 class="title">
                <a href="#!" class="line-clamp break-all">
                  Bệnh viện Đa khoa TP Đà Nẵng
                </a>
              </h3>
              <div class="rating">
                <img src="../../assets/icons/star.svg" alt="Star" class="star" />
                <span class="value">4.5</span>
              </div>
            </div>
            <div class="foot">
              <button class="btn book-btn">Đặt lịch khám</button>
            </div>
          </div>
        </div>

        <!-- Course item 3 -->
        <div class="course-item">
          <a href="#!">
            <img
              src="../../assets/img/benhvien3.jpg"
              alt="Web App design"
              class="thumb"
            />
          </a>
          <div class="info">
            <div class="head">
              <h3 class="title">
                <a href="#!" class="line-clamp break-all">
                  Bệnh viện ưu bướu
                </a>
              </h3>
              <div class="rating">
                <img src="../../assets/icons/star.svg" alt="Star" class="star" />
                <span class="value">4.5</span>
              </div>
            </div>

            <div class="foot">
              <button class="btn book-btn">Đặt lịch khám</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data:{
    return:{
      
    }
  }
};
</script>

<style scoped>
#hospitalUser {
    padding: 65px 0;
    margin-top: 60px;
}

.hospital-top {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.hospital-top .desc {
    margin-top: 16px;
    width: 458px;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #5f5b53;
    text-align: left;
}

.hospital-top .controls {
    display: flex;
    gap: 18px;
}

.hospital-top .control-btn {
    display: flex;
    align-items: center;
    justify-content: center;
    width: 40px;
    height: 40px;
    border-radius: 50%;
    color: var(--primary-color);
    border: 1px solid var(--primary-color);
    background: transparent;
}

.hospital-top .control-btn:hover {
    color: #fff;
    background: var(--primary-color);
    cursor: pointer;
}

#hospitalUser .course-list {
    display: flex;
    gap: 30px;
    margin-top: 55px;

    overflow-x: auto; /* Thêm overflow-x: auto để hiển thị thanh cuộn ngang */
    white-space: nowrap; /* Ngăn các course-item xuống dòng */
    -webkit-overflow-scrolling: touch; /* Cho phép cuộn trên các thiết bị cảm ứng */
}
#hospitalUser .course-list::-webkit-scrollbar {
    width: 10px; /* Độ rộng của thanh cuộn */
    height: 10px; /* Độ cao của thanh cuộn */
}

/* Đổi màu của phần trượt của thanh cuộn */
#hospitalUser .course-list::-webkit-scrollbar-thumb {
    background-color: #61bfeb; /* Màu của phần trượt */
    border-radius: 5px; /* Độ cong của phần trượt */
}

/* Đổi màu của phần nền của thanh cuộn */
#hospitalUser .course-list::-webkit-scrollbar-track {
    background-color: #f1f1f1; /* Màu của phần nền */
    border-radius: 5px; /* Độ cong của phần nền */
}

#hospitalUser .course-item {
    flex: 1;
    background: #ffffff;
    border: 1px solid #e2dfda;
    border-radius: 12px;
    min-width: 320px;
}

#hospitalUser .course-item:hover {
    border-color: transparent;
    box-shadow: 0px 18px 36px rgba(0, 0, 0, 0.05);
}

#hospitalUser .course-item .thumb {
    width: calc(100% + 2px);
    height: 278px;
    margin: -1px;
    object-fit: cover;
    border-radius: 12px 12px 0px 0px;
}

#hospitalUser .course-item .info {
    padding: 16px 22px 22px;
}

#hospitalUser .course-item .rating,
#hospitalUser .course-item .foot,
#hospitalUser .course-item .head {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

#hospitalUser .course-item .title a {
    padding-right: 6px;
    font-weight: 600;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #171100;
    width: 260px;
    text-align: left;
}

#hospitalUser .rating .value {
    margin-left: 6px;
    font-size: 1.6rem;
    line-height: 1.75;
    color: #fea31b;
}

#hospitalUser .course-item .desc {
    margin-top: 6px;
    font-size: 1.4rem;
    line-height: 1.86;
    color: #5f5b53;
}

#hospitalUser .course-item .foot {
    margin-top: 12px;
}

#hospitalUser .course-item .price {
    font-weight: 600;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #171100;
}

#hospitalUser .course-item .book-btn {
    border: none;
}

#hospitalUser .course-item .book-btn:hover {
    color: #fff;
    background: var(--primary-color);
}
</style>