<template>
   <div id="features" class=" features-2nd">

            <div class="main-content">
                <div class="body">
                    <div class="images">
                        <img src="../../assets/img/layer-5111-(2).jpg"
                            alt="Take the next step toward your personal and professional goals with Lesson." />
                    </div>
                    <div class="content">

                        <h2 class="heading lv2">
                            Đội ngũ tư vấn
                        </h2>
                        <p class="desc">
                            Hội đồng tham vấn y khoa cùng đội ngũ biên tập viên là các bác sĩ, dược sĩ đảm bảo nội dung
                            chúng tôi cung cấp chính xác về mặt y khoa và cập nhật những thông tin mới nhất
                        </p>
                        <a href="#!" class="btn cta-btn">Tư vấn ngay</a>
                    </div>
                </div>
            </div>
        </div>
</template>

<script>
export default {

}
</script>

<style>
#features {
    margin-top: 135px;
    padding: 65px 0;
}

#features .body {
    display: flex;
    justify-content: space-between;
}

#features .images {
    display: flex;
    gap: 0 30px;
}

#features .images img {
    width: 500px;
    height: 404px;
    border-radius: 16px;
    object-fit: cover;
}

#features img.lower {
    margin-top: 34px;
}

#features .content {
    width: 41%;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    justify-content: center;
}

#features .desc {
    margin-top: 16px;
    font-size: 1.6rem;
    line-height: 1.75;
    color: #5f5b53;
    text-align: left;
}

#features .content .cta-btn {
    margin-top: 32px;
    min-width: 137px;
    color: #fff;
    background: var(--primary-color);
}

.features-2nd {
    margin-top: 70px;
}

.features-2nd .body {
    flex-direction: row-reverse;
}

.features-2nd .content {
    width: 49%;
}

.features-2nd .images img {
    width: 470px;
    height: 440px;
}
</style>