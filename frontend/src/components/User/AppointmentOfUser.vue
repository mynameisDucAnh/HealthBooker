<template>
     <div class="calendar">
                <h2 style="display: flex;
            justify-content: center;font-weight: 600;
    font-size: 22px;">Lịch khám bệnh</h2>

            <table>
                <tr>
                    <th>Số thứ tự</th>
                    <th>Ngày khám</th>
                    <th>Giờ khám</th>
                    <th>Bác sĩ</th>
                    <th>Chuyên khoa</th>
                    <th>Bệnh nhân</th>
                    <th>Năm sinh</th>
                    <!-- Thêm các cột thông tin khác nếu cần -->
                </tr>
                <tr>
                    <td>1</td>
                    <td>10/05/2024</td>
                    <td>08:00</td>
                    <td>Dr. Nguyễn Văn A</td>
                    <td>Nội khoa</td>
                    <td>Nguyễn Thị B</td>
                    <td>1980</td>
                    <!-- Thêm thông tin khác tương ứng -->
                </tr>
                <tr>
                    <td>1</td>
                    <td>10/05/2024</td>
                    <td>08:00</td>
                    <td>Dr. Nguyễn Văn A</td>
                    <td>Nội khoa</td>
                    <td>Nguyễn Thị B</td>
                    <td>1980</td>
                    <!-- Thêm thông tin khác tương ứng -->
                </tr>
                <!-- Thêm các hàng dữ liệu khác nếu cần -->
            </table>
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