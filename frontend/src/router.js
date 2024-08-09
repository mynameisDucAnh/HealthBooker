import { createRouter, createWebHistory } from 'vue-router';
import AdviseUserVue from "./components/User/AdviseUser.vue";
import FooterUserVue from "./components/User/FooterPage.vue";
import HeroUserVue from "./components/User/HeroUser.vue";
import DoctorUserVue from "./components/User/DoctorUser.vue";
import HospitalUserVue from "./components/User/HospitalUser.vue";
import NavbarUserVue from "./components/User/NavbarPage.vue";
import ListDoctorVue from "./components/User/ListDoctor.vue"
import ListHospitalVue from "./components/User/ListHospital.vue"
import RegistrationVue from "./components/RegistrationForm.vue"
import HospitalForm from "./components/Admin/HospitalForm.vue"
import AppointmentWithDoctor from "./components/User/AppointmentWithDoctor.vue"
import AppointmentWithHospital from "./components/User/AppointmentWithHospital.vue"

const routes = [
    {
        path: "/",
        components: {
            navbar: NavbarUserVue,
            hero: HeroUserVue,
            doctor: DoctorUserVue,
            hospital: HospitalUserVue,
            advise: AdviseUserVue,
            footer: FooterUserVue
        }
    },
    {
        path:"/registrationform" ,
        components:{
         default:RegistrationVue,
        }
     },
    {
        path: "/listdoctor",
        components: {
            navbar: NavbarUserVue,
            default: ListDoctorVue,
            footer: FooterUserVue
        }
    },
    {
        path: "/listhospital",
        components: {
            navbar: NavbarUserVue,
            default: ListHospitalVue,
            footer: FooterUserVue
        }
    },
    {
        path:"/appointmentDoctor",
        components:{
            navbar: NavbarUserVue,
            default:AppointmentWithDoctor,
            footer: FooterUserVue
        }
    },
    {
        path:"/appointmentHospital",
        components:{
            navbar: NavbarUserVue,
            default:AppointmentWithHospital,
            footer: FooterUserVue
        }
    },
    {
        path:"/admin/hospital",
        components:{
            default:HospitalForm,
        }
    },
]
const router = createRouter({
    history: createWebHistory(),
    routes,
  });
  
  export default router;