<template>
   <main>
        <div class="popular">

            <div class="main-content">

                <div class="popular-top">
                    <div class="info">
                        <h2 class="heading lv2">Danh sách bác sĩ</h2>
                        <p class="desc">
                            Bạn có thể chọn bác sĩ theo chuyên khoa để đặt khám
                        </p>
                    </div>
                </div>

                <div class="course-list">
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
    </main>
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
.popular {
    padding: 65px 0;
    margin-top: 40px;
    margin-left: 80px;
}

.popular-top {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.popular-top .desc {
    margin-top: 16px;
    width: 458px;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #5f5b53;
}

.popular-top .controls {
    display: flex;
    gap: 18px;
}

.popular-top .control-btn {
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

.popular-top .control-btn:hover {
    color: #fff;
    background: var(--primary-color);
    cursor: pointer;
}

.popular .course-list {
    display: flex;
    width: 1200px;
    gap: 50px;
    margin-top: 55px;

    flex-wrap: wrap;
    overflow-x: auto; /* Thêm overflow-x: auto để hiển thị thanh cuộn ngang */
    white-space: nowrap; /* Ngăn các course-item xuống dòng */
    -webkit-overflow-scrolling: touch; /* Cho phép cuộn trên các thiết bị cảm ứng */
}
.popular .course-list::-webkit-scrollbar {
    width: 10px; /* Độ rộng của thanh cuộn */
    height: 10px; /* Độ cao của thanh cuộn */
}

/* Đổi màu của phần trượt của thanh cuộn */
.popular .course-list::-webkit-scrollbar-thumb {
    background-color: #61bfeb; /* Màu của phần trượt */
    border-radius: 5px; /* Độ cong của phần trượt */
}

/* Đổi màu của phần nền của thanh cuộn */
.popular .course-list::-webkit-scrollbar-track {
    background-color: #f1f1f1; /* Màu của phần nền */
    border-radius: 5px; /* Độ cong của phần nền */
}

.popular .course-item {
    flex: 1;
    background: #ffffff;
    border: 1px solid #e2dfda;
    border-radius: 12px;
    min-width: 320px;
    max-width: 320px;
}

.popular .course-item:hover {
    border-color: transparent;
    box-shadow: 0px 18px 36px rgba(0, 0, 0, 0.05);
}

.popular .course-item .thumb {
    width: calc(100% + 2px);
    height: 278px;
    margin: -1px;
    object-fit: cover;
    border-radius: 12px 12px 0px 0px;
}

.popular .course-item .info {
    padding: 16px 22px 22px;
}

.popular .course-item .rating,
.popular .course-item .foot,
.popular .course-item .head {
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.popular .course-item .title a {
    padding-right: 6px;
    font-weight: 600;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #171100;
}

.popular .rating .value {
    margin-left: 6px;
    font-size: 1.6rem;
    line-height: 1.75;
    color: #fea31b;
}

.popular .course-item .desc {
    margin-top: 6px;
    font-size: 1.4rem;
    line-height: 1.86;
    color: #5f5b53;
}

.popular .course-item .foot {
    margin-top: 12px;
}

.popular .course-item .price {
    font-weight: 600;
    font-size: 1.8rem;
    line-height: 1.67;
    color: #171100;
}

.popular .course-item .book-btn {
    border: none;
}

.popular .course-item .book-btn:hover {
    color: #fff;
    background: var(--primary-color);
}
</style>