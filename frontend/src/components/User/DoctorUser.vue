<template>
  <div id="doctoruser">
    <div class="listdoctor">
      <div class="main-content">
        <div class="listdoctor-top">
          <div class="info">
            <h2 class="heading lv2">Đặt khám trực tuyến</h2>
            <p class="desc">
              Phiếu khám kèm số thứ tự và thời gian của bạn được xác nhận
            </p>
          </div>
          <div class="controls">
            <div style="display: flex; gap: 20px">
              <button class="control-btn" data-direction="left">
                <svg
                  width="8"
                  height="14"
                  viewBox="0 0 8 14"
                  fill="none"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    d="M7 1L1 7L7 13"
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                  />
                </svg>
              </button>
              <button class="control-btn" data-direction="right">
                <svg
                  width="8"
                  height="14"
                  viewBox="0 0 8 14"
                  fill="none"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path
                    d="M1 1L7 7L1 13"
                    stroke="currentColor"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                  />
                </svg>
              </button>
            </div>
            <div>
              <a href="./listdoctor">xem thêm</a>
            </div>
          </div>
        </div>

        <div  class="course-list">
          <!-- Course item 1 -->
          <div v-for="(doctor , index) in doctors"  :key="index" class="course-item">
            <a href="#!">
              <img
                src="../../assets/img/41.-Phan-Văn-Chí-scaled.jpg"
                alt="Basic web design"
                class="thumb"
              />
            </a>
            <div class="info">
              <div class="head">
                <h3 class="title">
                  <a href="#!" class="line-clamp break-all">
                    {{doctor.name}} 
                  </a>
                </h3>
                <div class="rating">
                  <img src="../../assets/icons/star.svg" alt="Star" class="star" />
                  <span class="value">{{doctor.experienceYears}}</span>
                </div>
              </div>
              <p class="desc line-clamp line-2 break-all">
                 {{doctor.specialization}}
              </p>
              <div class="foot">
                <button class="btn book-btn">Đặt lịch khám</button>
              </div>
            </div>
          </div>

        
          
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { getDoctors } from '../../api/doctorService';
export default {
  data() {
    return {
      doctors: [],
    };
  },
  async mounted() {
    try {
      const response = await getDoctors();
      this.doctors = response.data.doctorList;
    } catch (error) {
      console.error('Error fetching doctors:', error);
    }
  },

};
</script>

<style>
#doctoruser {
    padding: 65px 0;
    margin-top: 60px;
}

.listdoctor-top {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.listdoctor-top .desc {
    margin-top: 16px;
    width: 558px;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #5f5b53;
    text-align: left;
}

.listdoctor-top .controls {
    display: flex;
    gap: 18px;
    flex-direction: column;
}
.listdoctor-top .controls a{
    padding-left: 10px;
    
}
.listdoctor-top .control-btn {
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

.listdoctor-top .control-btn:hover {
    color: #fff;
    background: var(--primary-color);
    cursor: pointer;
}

#doctoruser .course-list {
    display: flex;
    gap: 30px;
    margin-top: 55px;

    overflow-x: auto; /* Thêm overflow-x: auto để hiển thị thanh cuộn ngang */
    white-space: nowrap; /* Ngăn các course-item xuống dòng */
    -webkit-overflow-scrolling: touch; /* Cho phép cuộn trên các thiết bị cảm ứng */
}
#doctoruser .course-list::-webkit-scrollbar {
    width: 10px; /* Độ rộng của thanh cuộn */
    height: 10px; /* Độ cao của thanh cuộn */
}

/* Đổi màu của phần trượt của thanh cuộn */
#doctoruser .course-list::-webkit-scrollbar-thumb {
    background-color: #61bfeb; /* Màu của phần trượt */
    border-radius: 5px; /* Độ cong của phần trượt */
}

/* Đổi màu của phần nền của thanh cuộn */
#doctoruser .course-list::-webkit-scrollbar-track {
    background-color: #f1f1f1; /* Màu của phần nền */
    border-radius: 5px; /* Độ cong của phần nền */
}

#doctoruser .course-item {
    flex: 1;
    background: #ffffff;
    border: 1px solid #e2dfda;
    border-radius: 12px;
    min-width: 320px;
}

#doctoruser .course-item:hover {
    border-color: transparent;
    box-shadow: 0px 18px 36px rgba(0, 0, 0, 0.05);
}

#doctoruser .course-item .thumb {
    width: calc(100% + 2px);
    height: 278px;
    margin: -1px;
    object-fit: cover;
    border-radius: 12px 12px 0px 0px;
  object-position: top;

}

#doctoruser .course-item .info {
    padding: 16px 22px 22px;
}

#doctoruser .course-item .rating,
#doctoruser .course-item .foot,
#doctoruser .course-item .head {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

#doctoruser .course-item .title a {
    padding-right: 6px;
    font-weight: 600;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #171100;
    width: 180px;
}

#doctoruser .rating .value {
    margin-left: 6px;
    font-size: 1.6rem;
    line-height: 1.75;
    color: #fea31b;
}

#doctoruser .course-item .desc {
    margin-top: 6px;
    font-size: 1.4rem;
    line-height: 1.86;
    color: #5f5b53;
    text-align: left;
}

#doctoruser .course-item .foot {
    margin-top: 12px;
}

#doctoruser .course-item .price {
    font-weight: 600;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #171100;
}

#doctoruser .course-item .book-btn {
    border: none;
}

#doctoruser .course-item .book-btn:hover {
    color: #fff;
    background: var(--primary-color);
}
</style>