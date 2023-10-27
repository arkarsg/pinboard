import { useState } from "react";
import api from "../api/axiosConfig";
import PinList from "./PinList";

const PinCrud = ({ load, pins }) => {
  const [id, setId] = useState("");
  const [title, setTitle] = useState("");
  const [body, setBody] = useState("");
  const [published, setPublished] = useState(false);

  async function save(event) {
    event.preventDefault();
    await api.post("/create", {
      title: title,
      body: body,
      published: published,
    });

    setId("");
    setTitle("");
    setBody("");
    setPublished("");
    load();
  }

  async function editPin(updatedPin) {
    setId(updatedPin.id);
    setTitle(updatedPin.title);
    setBody(updatedPin.body);
    setPublished(updatedPin.published);
  }

  async function update(event) {
    event.preventDefault();
    if (!id) return alert("Pin not found");
    await api.put("/update", {
      id: id,
      title: title,
      body: body,
      published: published,
    });
    setId("");
    setTitle("");
    setBody("");
    setPublished("");
    load();
  }

  return (
    <div className="container mt-4">
      <form>
        <div className="form-group my-2">
          <input
            type="text"
            value={id}
            onChange={(e) => setId(e.target.value)}
          />
          <label>Title</label>
          <input
            type="text"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />
        </div>
        <div className="mb-2"
      </form>
    </div>
  );
};
