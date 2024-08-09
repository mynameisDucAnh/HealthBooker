<template>
    <div class="booking">
            <div class="profile">
                <div class="avatar">
                    <img src="../../assets/img/Anh-bac-si-nu-1-min.jpg" alt="">
                </div>
                <div class="info">
                    <h2>Bác sĩ : Lê Thị Minh Hồng</h2>
                    <p class="desc">24 năm kinh nghiệm</p>
                    <p class="Specialist">Chuyên khoa : Nhi Khoa</p>
                    <p class="Position">Chức vụ : Phó giám đốc bệnh viện Nhi</p>
                    <p class="Work-place">Nơi công tác : Đà Nẵng</p>
                    <p class="Introduce">Giới thiệu : Bác sĩ Chuyên khoa II Lê Thị Minh Hồng hiện đang là Phó Giám đốc
                        Bệnh viện Nhi Đồng 2. Bác sĩ trực tiếp khám bệnh theo yêu cầu chất lượng cao tại Bệnh Viện Nhi
                        Đồng 2 và phòng khám Nhi khoa (250 Nguyễn Xí, Phường 13, Bình Thạnh, TP.HCM).
                        <span>... xem thêm</span>
                    </p>
                </div>
            </div>
            <div class="container">
                <h2>Đặt lịch khám nhanh</h2>
                <div class="time-slots">
                    <div class="time-slot">08:00 - 08:20</div>
                    <div class="time-slot">08:20 - 08:40</div>
                    <div class="time-slot">08:40 - 09:00</div>
                    <div class="time-slot">09:00 - 09:20</div>
                    <div class="time-slot">09:20 - 09:40</div>
                    <div class="time-slot">09:40 - 10:00</div>
                    <div class="time-slot">10:00 - 10:20</div>
                    <div class="time-slot">10:20 - 10:40</div>
                    <div class="time-slot">10:40 - 11:00</div>
                    <div class="time-slot">11:00 - 11:20</div>
                    <div class="time-slot">13:20 - 13:40</div>
                    <div class="time-slot">13:40 - 14:00</div>
                    <div class="time-slot">14:00 - 14:20</div>
                    <div class="time-slot">14:20 - 14:40</div>
                    <div class="time-slot">14:40 - 15:00</div>
                    <div class="time-slot">15:00 - 15:20</div>
                    <div class="time-slot">15:20 - 15:40</div>
                    <div class="time-slot">15:40 - 16:00</div>
                    <div class="time-slot">16:00 - 16:20</div>
                    <div class="time-slot">16:20 - 16:40</div>

                </div>
                <div class="book">
                    <p>Hỗ trợ đặt khám <br>
                        0919293912
                    </p>
                    <div class="btn-book"><a href="">
                            ĐẶT KHÁM NGAY
                        </a></div>
                </div>
            </div>
        </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.booking{
    width: 900px;
    max-width: calc(100% - 128px);
    margin-left: auto;
    margin-right: auto;
    margin-bottom: 60px;
}
.profile{
    display: flex;
    flex-direction: row;
    margin-top: 50px;
    padding: 30px 12px;
    border: 1px solid #e2dfda;
    border-top-left-radius: 20px;
    border-top-right-radius: 20px;

}
.profile .avatar{
    width: 300px;
    height: 300px;
}
.profile .avatar img{
    width: 100%;
    height: 100%;
    object-fit: cover;
    border-radius: 999px;
}
.profile .info{
    padding: 12px 40px;
    line-height: 24px;
    width: 600px;
}
.profile .info h2{
    font-size: 24px;
    font-weight: 700;
    margin-bottom: 12px;
}
.profile .info ul{
    display: flex;
    gap: 50px;
}

.profile .info ul li{
    display: flex;
    border: 1px solid #e2dfda;
    font-weight: 400;
    padding: 12px 12px;
    border-radius: 999px;
    cursor: pointer;
}
.profile .info ul li:hover{
    background-color: #94bbe5;
}
.profile .info ul li img{
    width: 20px;
    margin-right: 6px;
}
.container {
    width: 100%;  
    border: 1px solid #e2dfda;
    border-bottom-left-radius: 20px;
    border-bottom-right-radius: 20px;

}
.container h2{
    font-weight: 600;
    padding: 20px 12px;
    border: 1px solid #e2dfda;

}

.time-slots::-webkit-scrollbar{
    width: 10px;
    height: 10px;
}
.time-slots::-webkit-scrollbar-thumb{
    background-color: #61bfeb;
    border-radius: 5px;
}
.time-slots {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    justify-items: center;
    overflow-y: auto; /* Cho phép lăn chuột */
    height: 100px; /* Độ cao cố định */
}

.time-slot {
    display: flex;
    justify-content: center;
    border: 1px solid #ccc;
    padding: 10px;
    cursor: pointer;
    border-radius: 6px;
    width: 220px;
}

.time-slot:hover {
    background-color: lightblue; 
}
.time-slot.selected {
    background-color: #007bff;
}

/* Thêm lớp hovered */
.time-slot.hovered {
    background-color: #61bfeb;
}
.book{
    display: flex;
    justify-content: space-between;
    padding: 12px 4px;
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
.bookHospital{
    display: flex;
    justify-content: space-between;
    padding: 12px 4px;
}
.bookHospital p{
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 12px 60px;
}
.bookHospital .btn-book{
    padding: 20px 120px;
    background-color: #007bff;
    border-radius: 12px;
}
.bookHospital .btn-book a{
    color: #fff;
}
.btn-book:hover{
    opacity: 0.8;
}
.detailInfo{
    display: flex;
    margin-top: 40px;
}
.detailInfo .textH{
    width: 600px ;
    margin-right: 50px;
}
.detailInfo .textH h2{
    font-size: 28px;
    font-weight: 500;
    margin: 30px 0;
}
.detailInfo .textH p{
    display: flex;
    line-height: 24px;
}
.detailInfo .imgH{
    margin-top: 88px;
    width: 300px;
    height: 200px;
}
.detailInfo .imgH img{
    border-radius: 12px;
    width: 100%;
    height: 100%;
    object-fit: cover;
}

</style>