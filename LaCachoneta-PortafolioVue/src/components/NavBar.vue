<script setup>
import { ref, onMounted, onUnmounted } from 'vue'
import logoImg from '/src/assets/LC.jpg'

const menuOpen = ref(false)
const isScrolled = ref(false)

const links = [
  { id: 1, name: 'Inicio', href: '#top' },
  { id: 2, name: 'Sobre Nosotros', href: '#sobre-nosotros' },
  { id: 3, name: 'Equipo', href: '#equipo' },
  { id: 4, name: 'Proyectos', href: '#proyectos' },
  { id: 5, name: 'Contacto', href: '#contacto' }
]

const handleScroll = () => {
  isScrolled.value = window.scrollY > 10
}

onMounted(() => window.addEventListener('scroll', handleScroll))
onUnmounted(() => window.removeEventListener('scroll', handleScroll))
</script>

<template>
  <nav :class="['navbar', { scrolled: isScrolled }]">
    <div class="logo">
      <img :src=logoImg alt="La cachoneta Logo" class="logo-img" />
      <span>La Cachoneta</span>
    </div>

    <button class="menu-btn" @click="menuOpen = !menuOpen">
      ☰
    </button>

    <ul :class="{ open: menuOpen }">
      <li v-for="link in links" :key="link.id">
        <a :href="link.href" @click="menuOpen = false">{{ link.name }}</a>
      </li>
    </ul>
  </nav>
</template>

<style scoped>
.navbar {
  position: sticky;
  top: 0;
  z-index: 1000;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 2rem;
  color: white;
  border-bottom: 1px solid rgba(153, 41, 234, 0.3);
  background: rgba(0, 0, 0, 0.5);
  backdrop-filter: blur(8px);
  transition: all 0.4s ease;
  min-height: 75px; 
}

.navbar.scrolled {
  background: rgba(10, 0, 20, 0.8);
  box-shadow: 0 4px 20px rgba(153, 41, 234, 0.2);
}

.logo {
  display: flex;
  align-items: center;
  gap: 0.75rem;
  font-weight: bold;
  font-size: 1.6rem;
}

.logo-img {
  height: 40px; 
  width: 40px;
  border-radius: 8px;
  object-fit: cover;
}

.logo span {
  background: linear-gradient(135deg, #9929EA, #CC66DA);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}


ul {
  display: flex;
  gap: 1.5rem;
  list-style: none;
  margin: 0;
  padding: 0;
}

ul li a {
  position: relative;
  color: white;
  text-decoration: none;
  font-weight: 500;
  transition: color 0.3s ease;
}

ul li a::after {
  content: '';
  position: absolute;
  left: 0;
  bottom: -4px;
  width: 0%;
  height: 2px;
  background: linear-gradient(90deg, #FAEB92, #CC66DA, #9929EA);
  border-radius: 4px;
  transition: width 0.3s ease;
}

ul li a:hover {
  color: #FAEB92;
  text-shadow: 0 0 8px #9929EA;
}

ul li a:hover::after {
  width: 100%;
}

.menu-btn {
  display: none;
  font-size: 1.6rem;
  background: none;
  border: none;
  color: white;
  cursor: pointer;
  z-index: 1001;
}

@media (max-width: 992px) {
  .menu-btn {
    display: block;
  }

  ul {
    position: absolute;
    top: 75px; 
    left: 0;
    width: 100%;
    
    background: rgba(0, 0, 0, 0.95);
    flex-direction: column;
    padding: 0; 
    border-radius: 0; 
    border-left: none; 

    max-height: 0;
    opacity: 0;
    visibility: hidden;
    overflow: hidden;
    transition: 
      max-height 0.3s ease-out, 
      opacity 0.2s ease-out,
      visibility 0.3s ease-out;
  }

  ul.open {
    max-height: 100vh; 
    opacity: 1;
    visibility: visible;
  }

  ul li {
    margin: 0;
    text-align: center; 
    width: 100%;
  }

  ul li a {
    display: block; 
    padding: 1.2rem 1rem; 
    border-bottom: 1px solid rgba(153, 41, 234, 0.1);
  }

  ul li a::after {
    display: none; 
  }

  ul li a:hover {
    background: rgba(153, 41, 234, 0.1);
    color: #FAEB92;
    text-shadow: none;
  }
}
</style>