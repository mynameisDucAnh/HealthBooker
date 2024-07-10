import { createRouter, createWebHistory } from 'vue-router';
import AdviseUserVue from "./components/User/AdviseUser.vue";
import FooterUserVue from "./components/User/FooterUser.vue";
import HeroUserVue from "./components/User/HeroUser.vue";
import DoctorUserVue from "./components/User/DoctorUser.vue";
import HospitalUserVue from "./components/User/HospitalUser.vue";
import NavbarUserVue from "./components/User/NavbarUser.vue";
import ListDoctorVue from "./components/User/ListDoctor.vue"
import ListHospitalVue from "./components/User/ListHospital.vue"

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
]
const router = createRouter({
    history: createWebHistory(),
    routes,
  });
  
  export default router;