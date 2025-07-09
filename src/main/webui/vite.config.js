import {defineConfig} from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/

export default defineConfig({
    // depending on your application, base can also be "/"
    base: '',
    plugins: [react()],
})