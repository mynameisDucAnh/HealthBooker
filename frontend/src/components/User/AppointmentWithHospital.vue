<template>
   <div class="container">
                <h2>Phiếu đăng kí khám bệnh</h2>
                <form action="#" method="post">
                    <div class="form-text">
                        <div>
                            <label for="fullname">Họ và tên:</label>
                            <input type="text" class="fullname" name="fullname" required>
                        </div>


                        <div class="gioitinh">
                            <label class="radio-container">Nam
                                <input type="radio" name="option" checked>
                            </label>
                            <label class="radio-container">Nữ
                                <input type="radio" name="option">
                            </label>
                        </div>
                        <div class="bhyt">
                            BHYT :
                            <label class="radio-container">Có
                                <input type="radio" name="bhyt" checked>
                            </label>
                            <label class="radio-container">Không
                                <input type="radio" name="bhyt">
                            </label>
                        </div>
                    </div>
                    <div class="form-text">
                        <div>
                            <label for="birthdate">Ngày sinh:</label>
                            <input type="date" class="birthdate" name="birthdate" required>
                        </div>
                        <div>
                            <label for="passpost">CCCD/CMND:</label>
                            <input type="text" class="passpost" name="passpost" required>
                        </div>
                        
                    
                    </div>
                    <div class="form-text">
                        <div>
                            <label for="job">Nghề nghiệp:</label>
                            <input style="width: 212px;" type="text" class="job" name="job" required>
                        </div>
                        <div>
                            <label for="number">Số điện thoại:</label>
                            <input type="text" class="number" name="number" required>
                        </div>
                    </div>
                    
                    <label for="homeTown">Quê quán:</label>
                    <input style="width: 700px;margin-bottom: 18px;" type="text" class="homeTown" name="homeTown" required><br/>
                    <div class="book-box">
                        <label>Khám chuyên khoa:</label>
                    <input style="width: 280px;margin-bottom: 18px;" type="text" class="specialist" name="specialist" required>
                        <label for="appDate">Đặt lịch khám ngày:</label>
                    <input type="date" class="appDate" name="birtappDatehdate" required>
                    </div>
                    <div class="book-box" style="
                        display: flex;gap: 10px;
                    ">
                            <label>Lý do khám bệnh:</label>
                            <textarea style="width: 640px; height: 28px; margin-bottom: 18px;" class="specialist" name="specialist" required></textarea>

                            
                        </div>
                    <ul><i>Lưu ý :</i>
                        <li>Khi bạn nhấn đăng ký bạn đã chấp nhận mọi <a href="!#">điều khoản</a> và <a href="!#">chính sách bảo mật</a> của chúng tôi</li>
                        <li>Vui lòng điền đẩy đủ và chính xác thông tin của bạn</li>
                        <li>Spam quá nhiều lần sẽ bị khóa tài khoản</li>
                    </ul>
                    <div class="book">
                        <p>Hỗ trợ đặt khám <br>
                            0919293912
                        </p>
                        <div class="btn-book"><a href="">
                                ĐẶT KHÁM NGAY
                            </a></div>
                    </div>
                </form>
            </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.container{
    width: 60%;
    margin-left: auto;
    margin-right: auto;
    margin-top: 50px;
    margin-bottom: 50px;
    border-radius: 16px;
    border: 1px solid #e2dfda;
    padding: 12px 24px;
    font-size: 20px;
}
.container h2{
   display: flex;
   font-weight: 600;
   font-size: 32px;
   justify-content: center;
   margin: 28px 0;
}
.form-text{
    display: flex;
    gap: 80px;
    margin: 16px 0;
}
.form-text .fullname,.passpost,.birthdate,.job,.number,.homeTown,.specialist{
    font-size: 20px;
    border: none;
    border-bottom: 2px dotted  black; /* Thêm border bottom */
    outline: none; /* Loại bỏ đường viền xung quanh input khi được focus */
    width: 240px;
    height: 24px;
}
.container ul{
    font-size: 12px;
    list-style:circle;
    margin: 12px 2px;
}
.container ul li{
    margin: 12px 14px;
}
.book{
    display: flex;
    justify-content: space-between;
    padding: 12px 4px;
    font-size: 16px;
}
.book p{
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 12px 60px;
}
.book .btn-book{
    padding: 20px 250px;
    background-color: #007bff;
    border-radius: 12px;
}
.book .btn-book a{
    color: #fff;
}
.btn-book:hover{
    opacity: 0.8;
}
</style>