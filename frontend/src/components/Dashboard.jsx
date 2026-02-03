import { Link } from "react-router-dom";
import logo from '../assests/Unisex Shop Logo.jpg'
import "./Dashboard.css";
import { useState } from "react";


const Dashboard = () => {
    const [search,setsearch]=useState("");
  return (
    <header className="header">
      {/* LOGO */}
      <div className="header-logo">
        <Link to="/" className="header-logo">
        <img src={logo} alt="logo" />
      </Link>
      </div>

      {/* NAV */}
      <nav className="nav-links">
        <Link to="/Men">MEN</Link>
        <Link to="/Women">WOMEN</Link>
        <Link to="/Kids" >KIDS</Link>
      </nav>
      <div className="header-search">
  <input
    type="text"
    placeholder="Search for products, brands and more"
    search
  />
</div>
      <button className="login-button" style={{marginRight: "20px"}}>Login</button>
      <button className="signup-button">Sign Up</button>
    </header>
  );
};

export default Dashboard;
