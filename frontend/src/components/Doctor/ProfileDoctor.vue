<template>
   <div class="profile-doctor">
                <div class="rowprofile">
                    <div class="avatardoctor">
                        <img src="./assets/img/Anh-bac-si-nam-8-min.jpg" alt="">
                    </div>
                    <div>
                        <ul>
                            <li>Họ và tên : Nguyễn Tuấn Anh</li>
                            <li>Giới tính : Nam</li>
                            <li>Số CCCD : 0124037563</li>
                            <li>Ngày sinh : 01/06/1995</li>
                            <li>Quê quán : Hà Tĩnh</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li>Chuyên khoa : Khoa nhi</li>
                            <li>Email : nguyentuananh@gmail.com</li>
                            <li>Số điện thoại : 095884885</li>                
                        </ul>
                    </div>
                </div>
                <div style="
                display: flex;
                justify-content: center;
            ">
                    <a href="#!" class="btn-profile">Sửa thông tin cá nhân</a>

                </div>
            </div>
</template>

<script>
export default {
    data(){
        return{
            doctors:[]
        }
        
    },
    
}
</script>

<style scoped>
.profile-doctor{
    margin-top: 80px;
    border: 1px solid #e2dfda;
    padding: 20px 20px;
    border-radius: 12px
}
.profile-doctor .avatardoctor{
    width: 240px;
    height: 320px;
}
.profile-doctor .avatardoctor img{
    width: 100%;
    height: 100%;
    object-fit: cover;
}
.profile-doctor .rowprofile{
    display: flex;
    gap:90px;
}
.profile-doctor .rowprofile ul{
    line-height: 40px;
}
.profile-doctor .rowprofile ul li{
    font-size: 20px;
}
.btn-profile{
    padding: 12px 20px;
    background-color: #007bff;
    border-radius: 12px;
}
.btn-profile{
    color: #fff;
}
.btn-profile:hover{
    opacity: 0.8;
}
</style>