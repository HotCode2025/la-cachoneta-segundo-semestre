<script setup>
import githubIcon from '/src/assets/github.svg'
import linkedinIcon from '/src/assets/linkedin.svg'
import instagramIcon from '/src/assets/instagram.svg'

defineProps({
  title: { type: String, required: true },
  descripcion: { type: String, required: true },
  telefono: { type: String, required: true },
  residencia: { type: String, required: true },
  foto: { type: String, default: '/src/assets/default-user.png' },
  redes: {
    type: Array,
    default: () => [
      { name: 'LinkedIn', url: 'https://linkedin.com', icon: linkedinIcon },
      { name: 'GitHub', url: 'https://github.com', icon: githubIcon },
      { name: 'Instagram', url: 'https://instagram.com', icon: instagramIcon }
    ]
  }
})
</script>

<template>
  <div class="card">
    <div class="card-content">
      <img class="foto" :src="foto" :alt="`Foto de ${title}`" />
      <h3>{{ title }}</h3>
      <p class="descripcion">{{ descripcion }}</p>

      <div class="info">
        <p>📍 {{ residencia }}</p>
        <p>📞 {{ telefono }}</p>
      </div>

      <div class="redes">
        <a
          v-for="r in redes"
          :key="r.name"
          :href="r.url"
          target="_blank"
          rel="noopener noreferrer"
          :title="r.name"
        >
          <img :src="r.icon" :alt="r.name" />
        </a>
      </div>
    </div>
  </div>
</template>

<style scoped>
.card {
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.15);
  backdrop-filter: blur(12px);
  border-radius: 22px;
  box-shadow: 0 8px 25px rgba(0, 0, 0, 0.25);
  overflow: hidden;
  transition: all 0.4s ease;
  transform: translateY(0);
}

.card:hover {
  transform: translateY(-6px) scale(1.02);
  box-shadow: 0 15px 40px rgba(0, 0, 0, 0.3);
  border-color: rgba(255, 255, 255, 0.25);
}

.card-content {
  padding: 2rem 1.5rem;
  display: flex;
  flex-direction: column;
  align-items: center;
  color: #f5f5f5;
  text-align: center;
}

.foto {
  width: 110px;
  height: 110px;
  border-radius: 50%;
  object-fit: cover;
  border: 3px solid rgba(255, 255, 255, 0.4);
  margin-bottom: 1rem;
  transition: all 0.3s ease;
}

.card:hover .foto {
  border-color: #fca311;
  transform: scale(1.05);
}

h3 {
  font-size: 1.4rem;
  font-weight: 600;
  color: #ffffff;
  margin: 0.4rem 0;
  letter-spacing: 0.5px;
}

.descripcion {
  font-size: 0.95rem;
  color: rgba(240, 240, 240, 0.85);
  margin-bottom: 1rem;
  line-height: 1.4;
}

.info {
  font-size: 0.9rem;
  color: rgba(230, 230, 230, 0.85);
  margin-bottom: 1rem;
}

.redes {
  display: flex;
  justify-content: center;
  gap: 1.2rem;
  margin-top: 0.5rem;
}

.redes img {
  width: 28px;
  height: 28px;
  opacity: 0.8;
  filter: invert(1);
  transition: transform 0.3s ease, opacity 0.3s ease, filter 0.3s ease;
}

.redes img:hover {
  transform: scale(1.2);
  opacity: 1;
  filter: invert(1) drop-shadow(0 0 8px #fca311);
}


@media (max-width: 600px) {
  .card-content {
    padding: 1.5rem 1rem;
  }
  .foto {
    width: 90px;
    height: 90px;
  }
  h3 {
    font-size: 1.2rem;
  }
  .descripcion {
    font-size: 0.9rem;
  }
}
</style>
