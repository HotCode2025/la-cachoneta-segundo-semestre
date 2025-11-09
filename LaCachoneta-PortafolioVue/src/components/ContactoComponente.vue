<script setup>
import githubIcon from '/src/assets/github.svg'
import linkedinIcon from '/src/assets/linkedin.svg'
import instagramIcon from '/src/assets/instagram.svg'
const email = 'lacachoneta@gmail.com'
const redes = [
  { name: 'LinkedIn', url: 'https://linkedin.com', icon: linkedinIcon },
  { name: 'GitHub', url: 'https://github.com', icon: githubIcon },
  { name: 'Instagram', url: 'https://instagram.com', icon: instagramIcon }
]
</script>

<template>
  <div class="contacto">
    <h2>Contacto</h2>
    <p>¿Querés trabajar con nosotros? ¡Escribinos!</p>
    <a :href="`mailto:${email}`" class="email-link">{{ email }}</a>
    <div class="redes">
      <a v-for="r in redes" :key="r.name" :href="r.url" target="_blank" class="social-link" :title="r.name">
         <img :src="r.icon" :alt="r.name" />
      </a>
    </div>
  </div>
</template>

<style scoped>
.contacto {
  padding: 4rem 2rem;
  text-align: center;
  background: linear-gradient(135deg, #000000 0%, #1a0033 100%);
  color: white;
}

h2 {
  font-size: 2.5rem;
  margin-bottom: 1.5rem;
  background: linear-gradient(135deg, #FAEB92, #CC66DA, #9929EA);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
  font-weight: bold;
}

p {
  font-size: 1.1rem;
  margin-bottom: 1.5rem;
  color: #CCCCCC;
}

.email-link {
  display: inline-block;
  background: linear-gradient(135deg, #9929EA, #CC66DA);
  color: #000000;
  padding: 0.8rem 1.5rem;
  border-radius: 25px;
  text-decoration: none;
  font-weight: bold;
  margin-bottom: 2rem;
  transition: all 0.3s ease;
  border: 2px solid #FAEB92;
}

.email-link:hover {
  transform: translateY(-3px);
  box-shadow: 0 8px 20px rgba(153, 41, 234, 0.4);
}

.redes {
  display: flex;
  justify-content: center;
  gap: 1.5rem;
  margin-top: 2rem;
}

.social-link {
  text-decoration: none;
  transition: all 0.3s ease;
  display: inline-block;
}

.social-link img {
  width: 35px;  
  height: 35px;
  filter: invert(1); 
  opacity: 0.8; 
  transition: all 0.3s ease;
}


.social-link:hover {
  transform: scale(1.3) rotate(10deg);
}

.social-link:hover img {
  opacity: 1;
  filter: invert(1) drop-shadow(0 0 10px #FAEB92); 
}


@media (max-width: 768px) {
  .contacto {
    padding: 2rem 1.5rem;
  }

  h2 {
    font-size: 2rem;
  }

  .redes {
    gap: 1rem;
  }

  .social-link img {
    width: 30px;
    height: 30px;
  }
}
</style>
