<script setup>
import DatosPersonales from './DatosPersonales.vue'
import agustinFoto from "../assets/Agustin.jpg"
import enzoFoto from "../assets/Enzo.jpg"
import cristianFoto from "../assets/Cristian.jpeg"
import emaFoto from "../assets/Ema.jpg"
import estebanFoto from "../assets/Esteban.jpg"
import gerFoto from "../assets/Ger.jpg"
import nicoFoto from "../assets/Nico.jpg"
import ramaFoto from "../assets/Rama.jpg"

const integrantes = [
  { 
    id: 1, 
    title: 'Agustin Gonzalez', 
    descripcion: 'Full Stack Developer', 
    telefono: '+54 9 2604-474849', 
    residencia: 'Mendoza, Argentina',
    foto: agustinFoto
  },
  { 
    id: 2, 
    title: 'Enzo Ulloa', 
    descripcion: 'Frontend Developer', 
    telefono: '+54 9 2615-123456', 
    residencia: 'Mendoza, Argentina',
    foto: enzoFoto
  },
  { 
    id: 3, 
    title: 'Cristhian Barrientos', 
    descripcion: 'Backend Developer', 
    telefono: '+54 9 2604-987654', 
    residencia: 'Mendoza, Argentina',
    foto: cristianFoto
  },
   { 
    id: 4, 
    title: 'Emmanuel Yapura', 
    descripcion: 'Backend Developer', 
    telefono: '+54 9 2604-987654', 
    residencia: 'Mendoza, Argentina',
    foto: emaFoto
  }, { 
    id: 5, 
    title: 'Esteban Montenegro', 
    descripcion: 'Backend Developer', 
    telefono: '+54 9 2604-987654', 
    residencia: 'Mendoza, Argentina',
    foto: estebanFoto
  }, { 
    id: 6, 
    title: 'Germán Fratucello', 
    descripcion: 'Backend Developer', 
    telefono: '+54 9 2604-987654', 
    residencia: 'Mendoza, Argentina',
    foto: gerFoto
  }, { 
    id: 7, 
    title: 'Nicolas Cohen', 
    descripcion: 'Backend Developer', 
    telefono: '+54 9 2604-987654', 
    residencia: 'Mendoza, Argentina',
    foto: nicoFoto
  },
  { 
    id: 8, 
    title: 'Ramiro Soria', 
    descripcion: 'Backend Developer', 
    telefono: '+54 9 2604-987654', 
    residencia: 'Mendoza, Argentina',
    foto: ramaFoto
  }
]
</script>

<template>
  <div class="integrantes">
    <h2>Nuestro Equipo</h2>
    <div class="grid">
      <DatosPersonales
        v-for="miembro in integrantes"
        :key="miembro.id"
        :title="miembro.title"
        :descripcion="miembro.descripcion"
        :telefono="miembro.telefono"
        :residencia="miembro.residencia"
        :foto="miembro.foto"
      />
    </div>
  </div>
</template>

<style scoped>
.integrantes {
  padding: 4rem 2rem;
  background: linear-gradient(135deg, #000000 0%, #1a0033 100%);
  color: white;
  text-align: center;
}

h2 {
  font-size: 2.5rem;
  margin-bottom: 3rem;
  background: linear-gradient(135deg, #FAEB92, #CC66DA, #9929EA);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
  font-weight: bold;
}

.grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(400px, 1fr));
  gap: 2rem;
  margin-top: 2rem;
}

@media (max-width: 768px) {
  .integrantes {
    padding: 2rem 1.5rem;
  }

  h2 {
    font-size: 2rem;
  }

  .grid {
    grid-template-columns: 1fr;
    gap: 1.5rem;
  }
}
</style>
