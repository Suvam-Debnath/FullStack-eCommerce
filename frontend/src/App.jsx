import './App.css'
import Products from './components/products/Products'
import { useState } from 'react'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Products/>
    </>
  )
}

export default App
