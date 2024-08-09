import React from "react";
import BasicLayout from "../../layouts/BasicLayout";
import { Outlet, useNavigate } from "react-router-dom";

function IndexPage(props) {
  const navigate = useNavigate();

  return (
    <BasicLayout>
      <div className="text-black font-extrabold -mt-10"> Products Menus </div>
      <div className="w-full flex m-2 p-2 ">
        <div
          className="text-xl m-1 p-2 w-20 font-extrabold text-center underline"
          onClick={() => navigate("list")}
        >
          LIST
        </div>
        <div
          className="text-xl m-1 p-2 w-20 font-extrabold text-center underline"
          onClick={() => navigate("add")}
        >
          ADD
        </div>
      </div>
      <div className="flex flex-wrap w-full ">
        <Outlet />
      </div>
    </BasicLayout>
  );
}

export default IndexPage;
