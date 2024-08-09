<template>
  <div>
    <div class="calendar">
                <h2 style="display: flex;
            justify-content: center;font-weight: 600;
    font-size: 22px;">Lịch khám bệnh</h2>

                <table>
                    <tr>
                        <th>Số thứ tự</th>
                        <th>Ngày khám</th>
                        <th>Giờ khám</th>
                        <th>Bệnh nhân</th>
                        <th>Chi tiết</th>
                        <th>In phiếu</th>

                        <!-- Thêm các cột thông tin khác nếu cần -->
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>10/05/2024</td>
                        <td>08:00</td>
                        <td>Nguyễn Văn A</td>
                        <td><i class="openPopup">Xem</i></td>
                        <td><a href="#!">In</a></td>

                        <!-- Thêm thông tin khác tương ứng -->
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>10/05/2024</td>
                        <td>08:00</td>
                        <td>Nguyễn Văn B</td>
                        <td><i class="openPopup">Xem</i></td>
                        <td><a href="#!">In</a></td>

                        <!-- Thêm thông tin khác tương ứng -->
                    </tr>
                </table>
            </div>
        </div>
        <!-- <button id="openPopup">Mở Popup</button> -->

        <div id="popup" class="popup">
            <div class="popup-content">
                <span class="close" id="closePopup">&times;</span>
                <div class="container">
                    <h2>Phiếu khám bệnh</h2>
                    <form action="#" method="post">
                        <h3>I.HÀNH CHÍNH</h3>
                        <div class="form-text">

                            <div>
                                <label for="fullname">Họ và tên:</label>
                                <input type="text" class="fullname" name="fullname" required>
                            </div>


                            <div class="gioitinh">
                                <label class="radio-container">Nam
                                    <input style="cursor: pointer;" type="radio" name="option" checked>
                                </label>
                                <label class="radio-container">Nữ
                                    <input style="cursor: pointer;" type="radio" name="option">
                                </label>
                            </div>
                            <div class="bhyt">
                                BHYT :
                                <label class="radio-container">Có
                                    <input style="cursor: pointer;" type="radio" name="bhyt" checked>
                                </label>
                                <label class="radio-container">Không
                                    <input style="cursor: pointer;" type="radio" name="bhyt">
                                </label>
                            </div>
                        </div>
                        <div class="form-text">
                            <div>
                                <label for="birthdate">Ngày sinh:</label>
                                <input style="cursor: pointer;" type="date" class="birthdate" name="birthdate" required>
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
                        <input style="width: 700px;margin-bottom: 18px;" type="text" class="homeTown" name="homeTown"
                            required><br />
                        <div class="book-box">
                            <label>Khám chuyên khoa:</label>
                            <input style="width: 280px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required>
                            <label for="appDate">Đă đặt lịch ngày:</label>
                            <input style="cursor: pointer;" type="date" class="appDate" name="birtappDatehdate"
                                required>
                        </div>
                        <div class="book-box" style="
                        display: flex;gap: 10px;
                    ">
                            <label>Lý do khám bệnh:</label>
                            <textarea style="width: 640px; height: 28px; margin-bottom: 18px;" class="specialist"
                                name="specialist" required></textarea>


                        </div>
                        <h3>II.HỎI BỆNH</h3>
                        <div class="book-box">
                            <label>Quá trình bệnh lý</label>
                            <input style="width: 660px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required>

                        </div>
                        <h3>Tiền sử bệnh</h3>
                        <div class="book-box">
                            <label>Bản thân</label>

                            <input style="width: 660px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required><br>
                            <label>Gia đình</label>
                            <input style="width: 660px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required>

                        </div>
                        <h3>III.KHÁM XÉT</h3>
                        <div class="book-box">
                            <label>Chuẩn đoán bệnh</label>

                            <input style="width: 660px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required><br>

                        </div>
                        <div class="book-box" style="
                        display: flex;
                    ">
                            <label>Cần phẫu thuật</label>

                            <input style="width: 120px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required><br>
                            <label>Nhập viện</label>
                            <input style="width: 120px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required>
                            <label>Điều trị tại nhà</label>
                            <input style="width: 120px;margin-bottom: 18px;" type="text" class="specialist"
                                name="specialist" required>
                        </div>
                        <!-- <div class="book">
                            <p>Hỗ trợ đặt khám <br>
                                0919293912
                            </p>
                            <div class="btn-book"><a href="">
                                    ĐẶT KHÁM NGAY
                                </a></div>
                        </div> -->
                    </form>
                </div>
            </div>
        </div>

</template>

<script>
export default {

}
</script>

<style scoped>
.calendar{
    margin-top: 50px;
}
.calendar h2{
    margin: 12px 12px;
}
.calendar table {
    width: 100%;
    border-collapse: collapse;
}

.calendar table,
th,
td {
    border: 1px solid #ddd;
}

.calendar th,
td {
    padding: 10px;
    text-align: left;
}

.calendar th {
    background-color: #f2f2f2;
}

.calendar tr:nth-child(even) {
    background-color: #f2f2f2;
}

.calendar tr:hover {
    background-color: #ddd
}
.container{
    width: 86%;
    margin-left: auto;
    margin-right: auto;
    margin-top: 12px;
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