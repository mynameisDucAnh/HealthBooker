<template>
   <footer class="footer">
        <div class="main-content">
            <div class="row">
                <!-- Column 1 -->
                <div class="column">
                    <img src="../../assets/img/logo2.png" alt="Lesson." class="logo" />
                    <p class="desc">
                        Với nhiều năm kinh nghiệm trong lĩnh vực Y tế, chúng tôi hiểu rằng, dữ liệu sức khỏe của bạn chỉ
                        thuộc về bạn,chúng tôi luôn tuân thủ các chính sách bảo mật dữ liệu cao nhất trên thế giới.
                    </p>
                    <div class="socials">
                        <a href="#!">
                            <img src="../../assets/icons/twitter.svg" alt="Twitter" class="icon" />
                        </a>
                        <a href="#!">
                            <img src="../../assets/icons/facebook.svg" alt="Facebook" class="icon" />
                        </a>
                        <a href="#!">
                            <img src="../../assets/icons/linkedin.svg" alt="Linkedin" class="icon" />
                        </a>
                        <a href="#!">
                            <img src="../../assets/icons/instagram.svg" alt="Instagram" class="icon" />
                        </a>
                    </div>
                </div>

                <!-- Column 2 -->
                <div class="column">
                    <h3 class="title">Dịch vụ</h3>
                    <ul class="list">
                        <li>
                            <a href="#!">Đặt khám bác sĩ</a>
                        </li>
                        <li>
                            <a href="#!">Đặt khám bệnh viện</a>
                        </li>
                        <li>
                            <a href="#!">Đặt khám phòng khám</a>
                        </li>
                        <li>
                            <a href="#!">Tin tức</a>
                        </li>
                    </ul>
                </div>

                <!-- Column 3 -->
                <div class="column">
                    <h3 class="title">Hỗ trợ</h3>
                    <ul class="list">
                        <li>
                            <a href="#!">Điều khoản sử dụng</a>
                        </li>
                        <li>
                            <a href="#!">Chính sách bảo mật</a>
                        </li>
                        <li>
                            <a href="#!">Chính sách giải quyết khiếu nại</a>
                        </li>
                        <li>
                            <a href="#!">Hỗ trợ khách hàng</a>
                        </li>
                    </ul>
                </div>

                <!-- Column 4 -->
                <div class="column">
                    <h3 class="title">Địa chỉ</h3>
                    <ul class="list">
                        <li>
                            <a href="#!">
                                <strong>Địa chỉ:</strong> 
                            </a>
                        </li>
                        <li>
                            <a href="#!">
                                <strong>Email:</strong> email@gmail.com
                            </a>
                        </li>
                        <li>
                            <a href="#!">
                                <strong>Phone:</strong> + 000 1234 567 890
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="copyright">
                <p>Copyright ©2022 webdesign.gdn All rights reserved</p>
            </div>
        </div>
    </footer>
</template>

<script>
export default {

}
</script>

<style>
.footer {
    padding: 96px 135px 0;
    background: #86c9f0;
}

.footer .row {
    display: flex;
    padding-bottom: 38px;
    border-bottom: 1px solid #59554b;
}

.footer .row .column {
    width: 21.6%;
    text-align: left;
}

.footer .row .column:first-child {
    width: 35%;
}

.footer .desc {
    margin-top: 18px;
    max-width: 267px;
    font-size: 1.4rem;
    line-height: 1.86;
    color: #474644;
}

.footer .socials {
    display: flex;
    gap: 18px;
    margin-top: 18px;
}

.footer .title {
    display: inline-block;
    padding: 0 48px 14px 0;
    border-bottom: 1px solid #59554b;
    font-weight: 600;
    font-size: 1.6rem;
    line-height: 1.75;
    color: #000;
}

.footer .list {
    margin-top: 28px;
}

.footer .list a {
    display: inline-block;
    margin-bottom: 12px;
    font-size: 1.4rem;
    line-height: 1.86;
    color: #44433d;
}

.footer .list li:last-child a {
    margin-bottom: 0;
}

.footer .list strong {
    font-weight: 600;
    color: #ffffff;
}

.footer .copyright {
    padding: 28px 0;
}

.footer .copyright p {
    font-size: 1.4rem;
    line-height: 1.86;
    text-align: center;
    color: #807d74;
}
</style>