import { Routes, Route } from "react-router-dom";
import Dashboard from "./components/Dashboard";
import Men from "./components/Men";
import Women from "./components/Women";
import Kids from "./components/Kids";

function App() {
  return (
    <>
      <Dashboard />
      <Routes>
        <Route path="/men" element={<Men />} />
        <Route path="/women" element={<Women />} />
        <Route path="/kids" element={<Kids />} />
      </Routes>
    </>
  );
}

export default App;
